<script >
export default {
    data: () => ({
      valid: true,
      name: '',
      nameRules: [
        v => !!v || 'Name is required',
        v => (v && v.length <= 10) || 'Name must be less than 10 characters',
      ],
      email: '',
      emailRules: [
        v => !!v || 'E-mail is required',
        v => /.+@.+\..+/.test(v) || 'E-mail must be valid',
      ],
      select1: null,
      types: [
        'Tiger',
        'Snake',
        'Bear',
        'Wolf',
      ],
      select2: null,
      family: [
        'Felines',
        'Canids',
        'Reptiles',
        'Mustelids',
        'Leporidae',
      ],
      select3: null,
      genders: [
        'Female',
        'Male',
      ],
      checkbox: false,
    }),
    methods: {
      validate () {
        this.$refs.form.validate()
      },
      reset () {
        this.$refs.form.reset()
      },
      resetValidation () {
        this.$refs.form.resetValidation()
      },
    },
  }
</script>

<template>
<v-form class="formAdd"
    ref="form"
    v-model="valid"
    lazy-validation
  >
    <h1>Add new animal</h1>
    <v-text-field class="labelsInputs"
      v-model="name"
      :counter="15"
      :rules="nameRules"
      label="Name"
      required
    ></v-text-field>

    <v-select class="labelsInputs"
      v-model="select1"
      :items="types"
      :rules="[v => !!v || 'Item is required']"
      label="Type"
      required
    ></v-select>

    <v-select class="labelsInputs"
      v-model="select2"
      :items="family"
      :rules="[v => !!v || 'Item is required']"
      label="Family"
      required
    ></v-select>

    <v-select class="labelsInputs"
      v-model="select3"
      :items="genders"
      :rules="[v => !!v || 'Item is required']"
      label="Gender"
      required
    ></v-select>

    <v-text-field class="labelsInputs"
      v-model="date"
      :counter="15"
      :rules="dateRules"
      label="Date"
      required
    ></v-text-field>



    <v-btn 
      :disabled="!valid"
      color="$background-buttons"
      class="buttonAdd"
      @click="validate"
    >
      Add
    </v-btn>

<div class="buttonsForm">
    <v-btn
      color="$background-buttons"
      class="mr-4"
      @click="reset"
    >
      Reset 
    </v-btn>

    <v-btn class="cancelButton"
    
      @click="resetValidation"
    >
      Cancel
    </v-btn>
</div>

  </v-form>

</template>

<style lang="scss" scope>
@use '../sass/styles.scss' as *;

h1 {
    color: $font-color-info;
    text-align: center;
    font-family: $font-family;
}

.labelsInputs  {
    border-radius: $border-radius;
    margin: 0.5em;
    background-color: $background-inputs;
}

.buttonAdd  {
    background-color: $background-buttons;
    border-radius: $border-radius;
    max-width: 40%;
    display: flex;
    justify-content: center;
    align-items: center;
}
.mr-4 {
    background-color: $background-buttons;
    border-radius: $border-radius;
    max-width: 40%;
    display: flex;
    align-items: center;
    justify-content: center;
}
.cancelButton  {
    background-color: $background-buttons;
    border-radius: $border-radius;
    max-width: 40%;
}

.buttonsForm  {
    display: flex;
    align-items: center;
    justify-content: center;
    
}
.formAdd          {
    border-radius: $border-radius;
    font-family: $font-family;
    background-color: $background-box;
    padding: 1em 2em;
    margin: 3em;
    box-shadow: 0px 0px 20px 20px rgba(38, 62, 50, 0.76);;
}
</style>
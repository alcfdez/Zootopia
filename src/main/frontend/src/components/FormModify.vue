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
      family: [
        'Felines',
        'Canids',
        'Reptiles',
        'Mustelids',
        'Leporidae',
      ],
      select2: null,
      types: [
        'Tiger',
        'Snake',
        'Bear',
        'Wolf',
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
<div class="inputsBox">
<v-form class="formAdd"
    ref="form"
    v-model="valid"
    lazy-validation
  >
  
    <h1>Modify the animal</h1>
    <v-text-field class="labelsInputs"
      v-model="name"
      :counter="15"
      :rules="nameRules"
      label="Name"
      required
      ></v-text-field>

      <v-select class="labelsInputs"
        v-model="select2"
        :items="family"
        :rules="[v => !!v || 'Item is required']"
        label="Family"
        required
      ></v-select>

    <v-select class="labelsInputs"
      v-model="select1"
      :items="types"
      :rules="[v => !!v || 'Item is required']"
      label="Type"
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
      class="buttonReset"
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
</div>

</template>

<style lang="scss" scope>
@use '../sass/styles.scss' as *;

.formAdd{
    width: 70%;
    margin-left: 15%;
    font-family: $font-family;
    padding: 1em 2em;
    @include box($background-box, $border-radius, $background-box-border); 
}
    .inputsBox{ 
      width: 100%;
      margin: 0 ;
        h1 {
        color: $font-color-info;
        text-align: center;
        font-family: $font-family;
        }

        .labelsInputs  {
        width: 80%;
        border-radius: $border-radius;
        margin: 0.5em;
        background-color: $background-inputs;
        }

    .buttonsForm{
    width: 80%;
    display: flex;
    flex-direction: row;
    justify-content: center;
    }
        .buttonAdd  {
        width: 60%;
        background-color: $background-buttons;
        border-radius: $border-radius;
        font-weight: bold;
        font-size: large;
        display: flex;
        justify-content: center;
        align-items: center;
        margin: 1em;
        }

        .cancelButton, .buttonReset  {
        background-color: $background-buttons;
        border-radius: $border-radius;
        font-weight: bold;
        width: 30%;
        margin-bottom: 2em;
        margin-left: 1em;
        margin-right: 1em;
        }
        
}
</style>
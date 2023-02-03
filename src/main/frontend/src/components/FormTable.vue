<script>
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
      select: null,
      items: [
        'Item 1',
        'Item 2',
        'Item 3',
        'Item 4',
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
<v-form
    ref="form"
    v-model="valid"
    lazy-validation
  >
    <v-text-field
      v-model="name"
      :counter="15"
      :rules="nameRules"
      label="Name"
      required
    ></v-text-field>

    <v-select
      v-model="select"
      :items="Type"
      :rules="[v => !!v || 'Item is required']"
      label="Type"
      required
    ></v-select>

    <v-select
      v-model="select"
      :items="Family"
      :rules="[v => !!v || 'Item is required']"
      label="Family"
      required
    ></v-select>



    <v-select
      v-model="select"
      :items="Gender"
      :rules="[v => !!v || 'Item is required']"
      label="Gender"
      required
    ></v-select>

    <v-text-field
      v-model="date"
      :counter="15"
      :rules="dateRules"
      label="Date"
      required
    ></v-text-field>

    <v-checkbox
      v-model="checkbox"
      :rules="[v => !!v || 'You must agree to continue!']"
      label="Do you agree?"
      required
    ></v-checkbox>

    <v-btn
      :disabled="!valid"
      color="success"
      class="mr-4"
      @click="validate"
    >
      ADD
    </v-btn>

    <v-btn
      color="error"
      class="mr-4"
      @click="reset"
    >
      Reset 
    </v-btn>

    <v-btn
      color= $background-buttons
      @click="resetValidation"
    >
      Cancel
    </v-btn>
  </v-form>

</template>

<style lang="scss" scope>
@use '../sass/styles.scss' as *;

</style>
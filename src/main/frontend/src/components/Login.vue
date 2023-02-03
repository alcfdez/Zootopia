<script setup>
import { ref } from 'vue';
let user = ref('');
let password = ref('');

</script>
<template>
  
  
  <main>
  
     <h1> {{ user }}</h1>
     <h1>{{ password }}</h1> 
      
    <v-text-field
      label = "User:"
      :rules="rules"
      hide-details="auto" v-model="user" >
    </v-text-field>

    <v-text-field
      label = "Password:"
      type="password"
      :rules="rules"
      hide-details="auto" v-model="password">
    </v-text-field>

    <v-btn rounded>CONNECT</v-btn>
    <div>
      <a href="">Forgot your password?</a>

    

    </div>
    
      
    
    
    
    
  </main>
</template>


<style lang="scss" scoped>
@use "../sass/styles.scss" as *;

    
  </style>
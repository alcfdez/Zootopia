<script setup>
import dashboardAside from '../components/dashboard/dashboardAside.vue';
import Header from '../components/Header.vue';
</script>

<template>
  <main>
    <div class="header">
    <Header/>
  </div>
    <dashboardAside />
  </main>
</template>

<style lang="scss" scoped>
 @use "./src/sass/styles.scss" as *;

 main{
    background: $background-page;
    background-repeat: no-repeat;
    background-size: cover ;
    
  }

    .header {
      margin: 30px;    
    }

    



</style>
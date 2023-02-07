<script setup>
import dashboardAside from '../components/dashboard/dashboardAside.vue';
import Header from '../components/Header.vue';
</script>

<template>
  <main>
    <Header/>
    <dashboardAside />
  </main>
</template>

<style lang="scss" scoped>
 @use "../src/sass/styles.scss" as *;

 main{
    background: $background-page;
    background-repeat: no-repeat;
    background-size: cover;
}



</style>
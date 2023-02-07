<script setup>
import FormTable from "../components/FormTable.vue";
import HeaderVue from "../components/Header.vue";
import LoginVue from "../components/Login.vue";
import NavVue from "../components/Nav.vue";
</script>

<template>
  <main> 
    <LoginVue></LoginVue>
    <FormTable></FormTable>
    <!-- <LoginVue></LoginVue> -->
    <!-- <HeaderVue></HeaderVue> -->
    <NavVue></NavVue>

  </main>
  
</template>

<style lang="scss" scoped>
@use "../sass/styles.scss" as *;
main{
  background: $background-page;
  background-size: cover;
}
</style>

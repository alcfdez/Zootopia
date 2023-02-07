<script setup>
import FormTable from "../components/FormTable.vue";
import LoginVue from "../components/Login.vue";
</script>

<template>
  <main> 
    <LoginVue></LoginVue>
    <FormTable></FormTable>
  </main>
</template>

<style lang="scss" scoped>
@use "../sass/styles.scss" as *;
main{
  background: $background-page;
  background-size: cover;
}
</style>

<script setup>

const shotList = ()=>{

router.push({name: 'list',path:'/dashoard/list'})
}
import { ref } from "vue";
let user = ref("");
let password = ref("");
</script>
<template>
  <main>
    <div class="main-box">
      <div class="logoHeader">
        <img src="../assets/Logo header.png" alt="zootopia logo" />
      </div>
      <div class="text-field-box"></div>
      <v-text-field
        class="text-field"
        label="User:"
        :rules="rules"
        :counter="15"
        hide-details="auto"
        v-model="user"
      >
      </v-text-field>

      <v-text-field
        class="text-field"
        label="Password:"
        type="password"
        :rules="rules"
        :counter="15"
        hide-details="auto"
        v-model="password"
      >
      </v-text-field>

      <v-btn @click= "shotList()" rounded class="connect">CONNECT</v-btn>
      <div >
        <a class="forgot" href="">Forgot your password?</a>
      </div>
    </div>
  </main>
</template>

<style lang="scss" scoped>
@use "../sass/styles.scss" as *;

main {
  width: 100%;
  height: max-content;
  padding-top: 4%;
  padding-bottom: 4%;
  text-align: center;

  .main-box {
    padding: 5vw;
    @include box($background-box, $border-radius, $background-box-border);
    width: 70%;
    margin-left: 15%;
    display: flex;
    justify-content: center;

}
.text-field {
    width: 70%;
    background-color: $background-inputs;
    border-radius: $border-radius;
    margin: 2%;
}

.connect {
    background-color: $background-buttons;
    font-family: $font-family;
    font-weight: bold;
    color: $font-color-buttons;
}

.forgot{
    font-family: $font-family;
    color: $font-color-info;
    &:visited {
  color:$font-color-info;
}
}

}
</style>

<script setup>
import { ref } from 'vue';
let user = ref('');
let password = ref('');

</script>
<template>
    <main>
        <div class="main-box">
        <div class="logoHeader">
            <img src="../assets/Logo header.png" alt="zootopia logo">   
        </div>
    <v-text-field class="text-field"
        label = "User:"
        :rules="rules"
        hide-details="auto" v-model="user" >
    </v-text-field>

    <v-text-field class="text-field"
        label = "Password:"
        type="password"
        :rules="rules"
        hide-details="auto" v-model="password">
    </v-text-field>

    <v-btn rounded>CONNECT</v-btn>
    <div>
        <a href="">Forgot your password?</a>
    </div>
</div>
    </main>
</template>


<style lang="scss" scoped>
@use "../sass/styles.scss" as *;

main{
    width: 100%;
    height: 90rem;
    padding-top: 10%;
}
.main-box{
    padding: 2vw;
    @include box($background-box, $border-radius, $background-box-border);
    @include flex(flex, column, nowrap, center, center);
    width: 70%;
    margin-left: 15%;
}
.logoHeader{
    display: flex;
    justify-content: center;
}

.text-field{
    width: 70%;
    background-color: $background-inputs;
    border-radius: $border-radius;
    margin: 2%;
    
}
    
</style>

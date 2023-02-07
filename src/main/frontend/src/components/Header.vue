<script setup>
</script>


<template>
    <div class ="header">
        
        
        <div class ="logo">
            <img src="../assets/Logo header.png" alt="zootopia logo">
            
        </div>
    </div>

    </template>
   <style lang="scss" scoped>
   @use "../sass/styles.scss" as *;
   .header{
    @include box($background-box, $border-radius, $background-box-border);
    text-align: center;
    width: 80%;
   }




</style>
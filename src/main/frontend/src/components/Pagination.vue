<script setup>
import { ref } from "vue";

let page = ref(1);
</script>
<template>
    <div class="text-center">
        <v-pagination v-model="page"
        :length="4"
        prev-icon="mdi-menu-left"
        next-icon="mdi-menu-right"
        >
    </v-pagination>
    </div>
</template>

<style lang="scss" scoped>
@use "@/sass/styles.scss" as *;

</style>

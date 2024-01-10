<!-- HTML -->
<template>
  <AnimalsAPI text="Enter a Valid Animal Name"/>
</template>

<!-- JavaScript -->
<script>
import AnimalsAPI from "./components/AnimalsAPI.vue";

export default {
  name: "App",
  components: {
    AnimalsAPI,
  },
  data() {
    return {

    }
  }
};
</script>

<!-- CSS -->
<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>

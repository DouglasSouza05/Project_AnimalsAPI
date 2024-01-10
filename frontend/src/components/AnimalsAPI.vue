<template>
  <div class="container">
    <body>
      <h1>Animals API Web Page</h1>
      <h2>{{ text }}!</h2>
      <form @submit.prevent="submitForm">
        <input
          id="inputForm"
          v-model="message"
          type="text"
          placeholder="Write Here"
        />
        <button id="buttonForm" type="submit">Click Here</button>
      </form>

      <div class="columns" v-if="visibleDiv">
        <div class="column">
          <h3>Common Name</h3>
          <div class="name">
            <p>Name:</p>
          </div>
          <h3>Taxonomy</h3>
          <div class="taxonomy">
            <p>Kingdom:</p>
            <p>Phylum:</p>
            <p>Class:</p>
            <p>Order:</p>
            <p>Family:</p>
            <p>Genus:</p>
            <p>Scientific Name:</p>
          </div>
          <h3>Locations</h3>
          <div class="locations"></div>
        </div>

        <div class="column">
          <h3>Characteristics</h3>
          <div class="characteristics">
            <p>Prey:</p>
            <p>Name of Young:</p>
            <p>Group Behavior:</p>
            <p>Estimated Population:</p>
            <p>Biggest Threat:</p>
            <p>Habitat:</p>
            <p>Diet:</p>
            <p>Lifestyle:</p>
            <p>Group:</p>
            <p>Skin Type:</p>
            <p>Top Speed:</p>
            <p>Lifespan:</p>
            <p>Weight:</p>
            <p>Lenght:</p>
          </div>
        </div>
      </div>

      <div class="noInput" v-if="visibleError">
        <h4>ERROR: No Input Detected. Please {{ text }}</h4>
      </div>
    </body>
  </div>
</template>

<script>
export default {
  name: "AnimalsAPI",
  props: { text: String },
  data() {
    return {
      message: "",
      visibleDiv: false,
      visibleError: false,
    };
  },
  methods: {
    submitForm() {
      if (this.message.trim() !== "") {
          this.visibleDiv = true;
          this.visibleError = false;
      } else {
          this.visibleDiv = false;
          this.visibleError = true;
      }
    },
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
#inputForm {
  padding: 10px;
  margin: 5px;
  border: 1px solid #ccc;
  border-radius: 5px;
  cursor: pointer;
  font-size: 18px;
}
#buttonForm {
  padding: 10px 15px;
  margin: 5px;
  background-color: #4caf50; /* Cor de fundo verde, você pode ajustar conforme necessário */
  color: white; /* Cor do texto branco */
  border: none;
  border-radius: 5px;
  cursor: pointer;
  font-size: 18px;
}
.columns {
  display: flex;
  justify-content: center; /* centralizar horizontalmente */
}
.column {
  margin: 0 100px; /* adiciona margem apenas na parte horizontal */
  text-align: left;
}
h3 {
  font-size: 25px;
}
h4 {
    font-size: 20px;
}
</style>

<template>
  <div>
    <h2>LOGIN</h2>
    <div>
      <label>
        姓名：<input v-model="loginForm.username"/>
      </label>
    </div>
    <div>
      <label>
        密码：<input v-model="loginForm.password"/>
      </label>
    </div>
    <div>
      <button @click="login">登录</button>
    </div>
  </div>
</template>

<script>
    export default {
        name: "HelloWorld",
        data() {
            return {
                loginForm: {
                    username: '',
                    password: ''
                }
            }
        },
        methods: {
            login() {
                //console.log(JSON.stringify(this.loginForm));
                this.axios.get("http://127.0.0.1:8090/api/login", {params: {username: this.loginForm.username}}).then(({data}) => {
                    if (data.msg=="Success") {
                        window.localStorage.setItem("user", JSON.stringify(data.data));
                        this.$router.push("/home");
                    } else {
                        alert(this.loginForm);
                        alert(this.loginForm.username);
                        alert(data.msg);
                    }
                })
            }
        }
    }
</script>

<style scoped>
  div {
    margin-bottom: 20px;
  }
</style>


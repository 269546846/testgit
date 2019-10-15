import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export default new Router({
  routes: [

    {
      path: '/',
      name: 'HelloWorld',
      component:  resolve => require(['../components/HelloWorld.vue'], resolve)
    },
    {
      path: '/home',
      name: 'home',
      component:  resolve => require(['../components/home.vue'], resolve)
    }

/*
    {
      path: '/',
      name: 'home',
      component: home
    }*/
  ]
})

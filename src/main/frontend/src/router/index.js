import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
   
    {
      path: '/AddView',
      name: 'AddView',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/AddView.vue')
    },
    {
      path: '/dashboard',
      name: 'dashboard',
      component: () => import('../views/DashBoardView.vue'),
      // children: [
      //   {
      //     name: 'create',
      //     path: 'create',
      //     component : () => import('../views/CreateView.vue')
      //   },
      //   {
      //     name: 'list',
      //     path: 'list',
      //     component : () => import('../views/ListView.vue')
      //   }
      // ]
    }
  ]
})

export default router

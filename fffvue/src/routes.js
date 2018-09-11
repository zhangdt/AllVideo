const home = r => require.ensure([], () => r(require('./views/home.vue')), 'home')
export default [
    {
      path: '*',
      redirect: '/home'
    },
    {
        path: '/home',
        name: 'home',
        component: home
      },
]
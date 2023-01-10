<template>

    <v-data-table
        :headers="headers"
        :items="viewItem"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'ViewItemView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            viewItem : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/viewItems'))

            temp.data._embedded.viewItems.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.viewItem = temp.data._embedded.viewItems;
        },
        methods: {
        }
    }
</script>


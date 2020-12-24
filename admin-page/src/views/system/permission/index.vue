<template>
    <div class="app-container">
        <el-table
            :data="permissionList",
            style="width: 100%;margin-bottom: 20px;"
            row-key="id"
            border
            default-expand-all
            :tree-props="{children: 'children', hasChildren: 'hasChildren'}"
        >

        </el-table>
    </div>
</template>

<script>

export default {
    name: 'permissionPage',
}

</script>

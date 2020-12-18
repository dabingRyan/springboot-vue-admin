<template>
    <div style="padding:30px;">
        <el-input
            placeholder="请输入内容"
            v-model="keywords"
            clearable>
        </el-input>

        <el-button type="primary" size="small" icon="el-icon-search">查询</el-button>
                <el-button type="default" size="small">新增</el-button>

    </div>
</template>

<script>

export default {
    name: 'dictPage',
    data() {
        return {
            keywords: ''
        }
    }
}
</script>

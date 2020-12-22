<template>
    <div class="app-container">
        <div class="filter-container">
            <el-input class="filter-item" v-model="listQuery.keywords" placeholder="字典名称" style="width: 200px;"  />
            <el-select class="filter-item" v-model="listQuery.status" placeholder="字典状态" style="width: 130px;margin-left: 15px;">
                <el-option v-for="item in dictStatusList" :key="item.key" :label="item.displayName" :value="item.key" />
            </el-select>
            <el-button class="filter-item" type="primary" icon="el-icon-search" style="margin-left: 15px;">
                查询
            </el-button>
            <el-button class="filter-item" style="margin-left: 15px;" type="primary" icon="el-icon-plus">
                新增
            </el-button>
        </div>

        <el-table
            :key="tableKey"
            v-loading="listLoading"
            :data="list"
            fit
            highlight-current-row
            style="width: 100%;"
            @sort-change=""
        >
            <el-table-column label="ID" prop="id" sortable="custom" align="center" width="80">
                <template slot-scope="{row}">
                    <span>{{ row.id }}</span>
                </template>
            </el-table-column>

            <el-table-column label="字典名称" min-width="150px">
                <template slot-scope="{row}">
                    <span class="link-type" @click="">{{ row.dictName }}</span>
                </template>
            </el-table-column>
            <el-table-column label="创建者" width="110px" align="center">
                <template slot-scope="{row}">
                    <span>{{ row.createUser }}</span>
                </template>
            </el-table-column>
            <el-table-column label="创建日期" width="150px" align="center">
                <template slot-scope="{row}">
                    <span>{{ row.createTime}}</span>
                </template>
            </el-table-column>
            <el-table-column label="状态" class-name="status-col" width="100">
                <template slot-scope="{row}">
                    <el-tag :type="row.status">
                        {{ row.status }}
                    </el-tag>
                </template>
            </el-table-column>
        </el-table>
    </div>
</template>

<script>

export default {
    name: 'dictList',
    data() {
        return {
            tableKey: 0,
            listLoading: true,
            list: null,
            listQuery: {
                keywords: undefined,
                status: undefined
            },
            dictStatusList: [
                {'key': 1, 'displayName': '正常'},
                {'key': 0, 'displayName': '无效'}
            ]
        };
    },
    created() {
        this.getList();
    },
    methods: {
        getList() {
            this.listLoading = true;
            this.list = [
                {'id':1,'dictName':'产品分类','createTime':'2020-12-01 15:45:23','createUser':'Ryan', 'status': 1},
                {'id':2,'dictName':'销售渠道','createTime':'2020-12-01 15:45:23','createUser':'Ryan', 'status': 1},
                {'id':3,'dictName':'提现方式','createTime':'2020-12-01 15:45:23','createUser':'Ryan', 'status': 1}
            ];
            this.listLoading = false;
        }
    }
}
</script>

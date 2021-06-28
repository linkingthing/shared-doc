DROP TABLE IF EXISTS `t_recommend`;
CREATE TABLE `sys_user` (
  `id` varchar(50) NOT NULL,
  `username` varchar(50) DEFAULT NULL COMMENT '用户名',
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  `real_name` varchar(50) DEFAULT NULL COMMENT '真实姓名',
  `mobile` varchar(50) DEFAULT NULL COMMENT '手机号',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `status` int(1) DEFAULT NULL COMMENT '状态 0禁用 1启用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `flag` int(1) DEFAULT NULL COMMENT '删除标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统用户表';

INSERT INTO `sys_user`(`id`, `username`, `password`, `real_name`, `mobile`, `email`, `status`, `create_time`, `update_time`, `flag`) VALUES ('9ef604facb2911eaa511000c29c241fg', 'root', '31f123ba21dc3d21a9b54a7a78f65829', '张三', '13882035531', '13882035531@163.com', 1, '2020-07-27 14:50:57', '2020-07-27 14:50:57', 0);
INSERT INTO `sys_user`(`id`, `username`, `password`, `real_name`, `mobile`, `email`, `status`, `create_time`, `update_time`, `flag`) VALUES ('9ef604facb2911eaa511000c29c24tyu', 'qwe', '31f123ba21dc3d21a9b54a7a78f65829', '李四', '13882035532', '13882035532@163.com', 1, '2020-07-27 14:50:57', '2020-07-27 14:50:57', 0);

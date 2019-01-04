集成OK



# SQL


DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(64) NOT NULL COMMENT '密码',
  `display_name` varchar(255) DEFAULT NULL COMMENT '账号姓名',
  `work_num` varchar(50) DEFAULT NULL COMMENT '工号',
  `tel` varchar(20) DEFAULT NULL COMMENT '电话号码',
  `email` varchar(128) DEFAULT NULL COMMENT '电子邮箱',
  `status` int(10) NOT NULL DEFAULT '0' COMMENT '账号状态(0：正常 1:暂停)',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COMMENT='系统用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', 'admin', '管理员', '0001', '1767154864', '563435@163.com', '0', '2018-03-01 16:00:04', '2018-03-01 16:00:11');
INSERT INTO `sys_user` VALUES ('2', 'admin', 'ecf90f96-f032-4b56-ae28-0021364df118', 'a', '0002', '1354354', '4545@163.com', '0', '2018-03-01 16:01:00', '2018-03-07 16:01:05');
INSERT INTO `sys_user` VALUES ('3', '鹰酱', '1111', 'USA', '0003', '132345555', '2434444@163.com', '1', '2018-03-19 17:21:20', '2018-03-19 17:32:44');
INSERT INTO `sys_user` VALUES ('5', '毛熊', '1111', '俄羅斯', '0005', '1355885555', '24123424@163.com', '0', '2018-03-20 09:38:48', null);
INSERT INTO `sys_user` VALUES ('7', '高丽', '1111', '朝鲜', '0007', '1355885577', '24123477@163.com', '1', '2018-03-20 09:43:53', null);
INSERT INTO `sys_user` VALUES ('13', '大区客户', '2222', '华北', '2222', null, null, '0', '2018-03-22 10:14:13', null);
INSERT INTO `sys_user` VALUES ('14', '3333', '3333', 'CS', null, '1356565656', null, '0', '2018-03-22 21:13:04', null);
INSERT INTO `sys_user` VALUES ('15', '4444', '4444', '44', null, '135788785', null, '0', '2018-03-22 21:19:47', null);
INSERT INTO `sys_user` VALUES ('16', '5555', '5555', '55', null, '1384654', null, '1', '2018-03-22 21:24:48', null);
INSERT INTO `sys_user` VALUES ('17', '1111', '1111', '11', '1111', '13122323', '123223@163.com', '0', '2018-03-22 21:25:55', null);

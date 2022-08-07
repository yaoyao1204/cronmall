/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50725
Source Host           : localhost:3306
Source Database       : mybatis_plus

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2022-08-07 22:24:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL COMMENT '主键ID',
  `name` varchar(30) DEFAULT NULL COMMENT '姓名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `deleted` bigint(1) DEFAULT NULL COMMENT '是否删除',
  `version` int(11) DEFAULT NULL COMMENT '版本号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'Jone', '18', 'test1@baomidou.com', null, null, null, null);
INSERT INTO `user` VALUES ('2', 'Jack', '70', 'test2@baomidou.com', null, null, null, null);
INSERT INTO `user` VALUES ('3', 'Tom', '28', 'test3@baomidou.com', null, null, null, null);
INSERT INTO `user` VALUES ('4', 'Sandy', '21', 'test4@baomidou.com', null, null, null, null);
INSERT INTO `user` VALUES ('5', 'Billie', '24', 'test5@baomidou.com', null, null, null, null);
INSERT INTO `user` VALUES ('1555221163502747649', 'youyou', '70', '222@qq.com', '2022-08-04 23:56:35', '2022-08-04 23:57:49', null, null);
INSERT INTO `user` VALUES ('1555221564406902785', 'yiyi', '20', '222@qq.com', '2022-08-04 23:58:10', null, null, null);
INSERT INTO `user` VALUES ('1555222127899082753', 'erer', '20', '222@qq.com', '2022-08-05 00:00:25', '2022-08-05 00:00:25', null, null);
INSERT INTO `user` VALUES ('1556252175632543746', 'e', '20', '222@qq.com', '2022-08-07 20:13:27', '2022-08-07 20:13:27', '1', '1');
INSERT INTO `user` VALUES ('1556258738980007937', 'e', '20', '222@qq.com', '2022-08-07 20:39:32', '2022-08-07 20:39:32', '0', '1');

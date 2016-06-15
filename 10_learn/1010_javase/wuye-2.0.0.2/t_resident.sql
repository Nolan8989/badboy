/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50129
Source Host           : localhost:3306
Source Database       : lapm

Target Server Type    : MYSQL
Target Server Version : 50129
File Encoding         : 65001

Date: 2012-08-16 08:11:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_resident`
-- ----------------------------
DROP TABLE IF EXISTS `t_resident`;
CREATE TABLE `t_resident` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rsdname` varchar(255) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `degree` int(11) DEFAULT NULL,
  `identity` varchar(255) DEFAULT NULL,
  `imgpath` varchar(255) DEFAULT NULL,
  `previmgpath` varchar(255) DEFAULT NULL,
  `build_id` int(11) DEFAULT NULL,
  `unit_id` int(11) DEFAULT NULL,
  `room_id` int(11) DEFAULT NULL,
  `starttime` datetime DEFAULT NULL,
  `endtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=824 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of t_resident
-- ----------------------------
INSERT INTO `t_resident` VALUES ('771', '扥骚扥', '1', '13898798798', 'werw@qq.com', '33', '7', '464534534544562123', 'd:/afile/1338914692205realpath.jpg', 'd:/afile/1338914692205previewpath.jpg', '1', '1', '3', '2012-05-30 20:45:07', '2015-05-30 20:45:07');
INSERT INTO `t_resident` VALUES ('772', '韩寒', '2', '13898798798', 'werw@qq.com', '33', '7', '464534534544562123', 'd:/afile/1338914661031realpath.jpg', 'd:/afile/1338914661031previewpath.jpg', '1', '1', '3', '2012-05-15 20:45:08', '2012-05-30 20:45:08');
INSERT INTO `t_resident` VALUES ('773', 'haha2', '1', '138987987987', 'werw@qq.com', '3', '7', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:08', '2012-05-30 20:45:08');
INSERT INTO `t_resident` VALUES ('774', 'haha3', '1', '138987987987', 'werw@qq.com', '4', '7', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:09', '2012-05-30 20:45:09');
INSERT INTO `t_resident` VALUES ('775', 'haha4', '1', '138987987987', 'werw@qq.com', '33', '7', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:09', '2012-05-30 20:45:09');
INSERT INTO `t_resident` VALUES ('776', 'haha5', '1', '138987987987', 'werw@qq.com', '56', '7', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:09', '2012-05-30 20:45:09');
INSERT INTO `t_resident` VALUES ('777', 'haha6', '1', '138987987987', 'werw@qq.com', '5', '7', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:09', '2012-05-30 20:45:09');
INSERT INTO `t_resident` VALUES ('778', 'haha7', '1', '138987987987', 'werw@qq.com', '33', '7', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:09', '2012-05-30 20:45:09');
INSERT INTO `t_resident` VALUES ('782', 'haha3', '1', '138987987987', 'werw@qq.com', '67', '6', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:13', '2012-05-30 20:45:13');
INSERT INTO `t_resident` VALUES ('783', 'haha4', '1', '138987987987', 'werw@qq.com', '3', '6', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:13', '2012-05-30 20:45:13');
INSERT INTO `t_resident` VALUES ('784', 'haha5', '1', '138987987987', 'werw@qq.com', '33', '6', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:13', '2012-05-30 20:45:13');
INSERT INTO `t_resident` VALUES ('785', 'haha6', '1', '138987987987', 'werw@qq.com', '33', '6', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:14', '2012-05-30 20:45:14');
INSERT INTO `t_resident` VALUES ('786', 'haha7', '1', '138987987987', 'werw@qq.com', '40', '6', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:14', '2012-05-30 20:45:14');
INSERT INTO `t_resident` VALUES ('787', 'haha0', '1', '138987987987', 'werw@qq.com', '33', '5', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:18', '2012-05-30 20:45:18');
INSERT INTO `t_resident` VALUES ('788', 'haha1', '1', '138987987987', 'werw@qq.com', '45', '5', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:19', '2012-05-30 20:45:19');
INSERT INTO `t_resident` VALUES ('789', 'haha2', '1', '138987987987', 'werw@qq.com', '33', '5', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:19', '2012-05-30 20:45:19');
INSERT INTO `t_resident` VALUES ('790', 'haha3', '1', '138987987987', 'werw@qq.com', '11', '5', '464534534544562123', null, null, '2', '2', '3', '2012-05-30 20:45:19', '2012-05-30 20:45:19');
INSERT INTO `t_resident` VALUES ('791', 'haha4', '1', '138987987987', 'werw@qq.com', '11', '5', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:19', '2012-05-30 20:45:19');
INSERT INTO `t_resident` VALUES ('792', 'haha5', '1', '138987987987', 'werw@qq.com', '89', '5', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:19', '2012-05-30 20:45:19');
INSERT INTO `t_resident` VALUES ('793', 'haha6', '1', '138987987987', 'werw@qq.com', '11', '5', '464534534544562123', null, null, '3', '2', '3', '2012-05-30 20:45:19', '2012-05-30 20:45:19');
INSERT INTO `t_resident` VALUES ('794', 'haha7', '1', '138987987987', 'werw@qq.com', '13', '5', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:19', '2012-05-30 20:45:19');
INSERT INTO `t_resident` VALUES ('795', 'haha0', '1', '138987987987', 'werw@qq.com', '11', '4', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:23', '2012-05-30 20:45:23');
INSERT INTO `t_resident` VALUES ('796', 'haha1', '1', '138987987987', 'werw@qq.com', '11', '4', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:24', '2012-05-30 20:45:24');
INSERT INTO `t_resident` VALUES ('797', 'haha2', '1', '138987987987', 'werw@qq.com', '11', '4', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:24', '2012-05-30 20:45:24');
INSERT INTO `t_resident` VALUES ('798', 'haha3', '1', '138987987987', 'werw@qq.com', '33', '4', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:24', '2012-05-30 20:45:24');
INSERT INTO `t_resident` VALUES ('799', 'haha4', '1', '138987987987', 'werw@qq.com', '33', '4', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:24', '2012-05-30 20:45:24');
INSERT INTO `t_resident` VALUES ('800', 'haha5', '1', '138987987987', 'werw@qq.com', '33', '4', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:24', '2012-05-30 20:45:24');
INSERT INTO `t_resident` VALUES ('801', 'haha6', '1', '138987987987', 'werw@qq.com', '33', '4', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:24', '2012-05-30 20:45:24');
INSERT INTO `t_resident` VALUES ('802', 'haha7', '1', '138987987987', 'werw@qq.com', '33', '4', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:24', '2012-05-30 20:45:24');
INSERT INTO `t_resident` VALUES ('803', 'haha0', '1', '138987987987', 'werw@qq.com', '33', '3', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:28', '2012-05-30 20:45:28');
INSERT INTO `t_resident` VALUES ('804', 'haha1', '1', '138987987987', 'werw@qq.com', '33', '3', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:29', '2012-05-30 20:45:29');
INSERT INTO `t_resident` VALUES ('805', 'haha2', '1', '138987987987', 'werw@qq.com', '33', '3', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:29', '2012-05-30 20:45:29');
INSERT INTO `t_resident` VALUES ('806', 'haha3', '1', '138987987987', 'werw@qq.com', '33', '3', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:29', '2012-05-30 20:45:29');
INSERT INTO `t_resident` VALUES ('807', 'haha4', '1', '138987987987', 'werw@qq.com', '33', '3', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:29', '2012-05-30 20:45:29');
INSERT INTO `t_resident` VALUES ('808', 'haha5', '1', '138987987987', 'werw@qq.com', '33', '3', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:30', '2012-05-30 20:45:30');
INSERT INTO `t_resident` VALUES ('809', 'haha6', '1', '138987987987', 'werw@qq.com', '33', '3', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:30', '2012-05-30 20:45:30');
INSERT INTO `t_resident` VALUES ('810', 'haha7', '1', '138987987987', 'werw@qq.com', '33', '3', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:30', '2012-05-30 20:45:30');
INSERT INTO `t_resident` VALUES ('811', 'haha0', '1', '138987987987', 'werw@qq.com', '33', '2', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:41', '2012-05-30 20:45:41');
INSERT INTO `t_resident` VALUES ('812', 'haha1', '1', '138987987987', 'werw@qq.com', '33', '2', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:41', '2012-05-30 20:45:41');
INSERT INTO `t_resident` VALUES ('813', 'haha2', '1', '138987987987', 'werw@qq.com', '33', '2', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:42', '2012-05-30 20:45:42');
INSERT INTO `t_resident` VALUES ('814', 'haha3', '1', '138987987987', 'werw@qq.com', '33', '2', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:42', '2012-05-30 20:45:42');
INSERT INTO `t_resident` VALUES ('815', 'haha4', '1', '138987987987', 'werw@qq.com', '33', '2', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:42', '2012-05-30 20:45:42');
INSERT INTO `t_resident` VALUES ('816', 'haha5', '1', '138987987987', 'werw@qq.com', '33', '2', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:42', '2012-05-30 20:45:42');
INSERT INTO `t_resident` VALUES ('817', 'haha6', '1', '138987987987', 'werw@qq.com', '33', '2', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:42', '2012-05-30 20:45:42');
INSERT INTO `t_resident` VALUES ('818', 'haha7', '1', '138987987987', 'werw@qq.com', '33', '2', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:42', '2012-05-30 20:45:42');
INSERT INTO `t_resident` VALUES ('819', 'haha0', '1', '138987987987', 'werw@qq.com', '33', '1', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:51', '2012-05-30 20:45:51');
INSERT INTO `t_resident` VALUES ('820', 'haha1', '1', '138987987987', 'werw@qq.com', '33', '1', '464534534544562123', null, null, '1', '2', '3', '2012-05-30 20:45:51', '2012-05-30 20:45:51');
INSERT INTO `t_resident` VALUES ('821', '刘德华', '0', null, null, '0', '0', null, null, null, '0', '0', '0', null, null);
INSERT INTO `t_resident` VALUES ('822', '刘德华', '0', null, null, '0', '0', null, null, null, '2', '0', '0', null, null);
INSERT INTO `t_resident` VALUES ('823', '刘德华', '1', '13767867867', '43645@qq.com', '56', '4', '345345634563456345', 'd:/afile/1338476706227realimg.jpg', 'd:/afile/1338476706227preveiwimg.jpg', '2', '2', '1', '2012-05-10 23:04:52', '2012-05-31 23:04:52');

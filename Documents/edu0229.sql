/*
Navicat PGSQL Data Transfer

Source Server         : external_edu
Source Server Version : 80409
Source Host           : localhost:55555
Source Database       : edu
Source Schema         : edu

Target Server Type    : PGSQL
Target Server Version : 80409
File Encoding         : 65001

Date: 2012-02-29 11:29:15
*/


-- ----------------------------
-- Table structure for "edu"."ag_return_amount"
-- ----------------------------
DROP TABLE "edu"."ag_return_amount";
CREATE TABLE "edu"."ag_return_amount" (
"agent_return_id" numeric(10) DEFAULT fun_table_seq('ag_return_amount'::character varying, 'agent_return_id'::character varying, 'next'::character varying) NOT NULL,
"agent_id" numeric(5) NOT NULL,
"batch_id" numeric(5) NOT NULL,
"headcount" numeric(5) NOT NULL,
"fee_id" numeric(5) NOT NULL,
"amount_flag" bool NOT NULL,
"sum_amount" numeric(10,2),
"admin_id" numeric(5) NOT NULL,
"register_date" timestamp(6) DEFAULT now() NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."ag_return_amount" IS '招生点已收费及返利统计';
COMMENT ON COLUMN "edu"."ag_return_amount"."agent_return_id" IS '返利序列号';
COMMENT ON COLUMN "edu"."ag_return_amount"."agent_id" IS '招生点代码';
COMMENT ON COLUMN "edu"."ag_return_amount"."batch_id" IS '批次代码';
COMMENT ON COLUMN "edu"."ag_return_amount"."headcount" IS '人数';
COMMENT ON COLUMN "edu"."ag_return_amount"."fee_id" IS '费用类型';
COMMENT ON COLUMN "edu"."ag_return_amount"."amount_flag" IS '0/1 (credit / debit)';
COMMENT ON COLUMN "edu"."ag_return_amount"."sum_amount" IS '金额';

-- ----------------------------
-- Records of ag_return_amount
-- ----------------------------

-- ----------------------------
-- Table structure for "edu"."agent_relation"
-- ----------------------------
DROP TABLE "edu"."agent_relation";
CREATE TABLE "edu"."agent_relation" (
"agent_id" numeric(5) NOT NULL,
"refer_agent" numeric(5) NOT NULL,
"register_date" timestamp(6) DEFAULT now() NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."agent_relation" IS '招生点隶属关系';
COMMENT ON COLUMN "edu"."agent_relation"."agent_id" IS '招生点代码';
COMMENT ON COLUMN "edu"."agent_relation"."refer_agent" IS '隶属机构';
COMMENT ON COLUMN "edu"."agent_relation"."register_date" IS '登记时间';

-- ----------------------------
-- Records of agent_relation
-- ----------------------------
INSERT INTO "edu"."agent_relation" VALUES ('13', '10', '2012-02-25 11:07:06.79446');

-- ----------------------------
-- Table structure for "edu"."agent_return"
-- ----------------------------
DROP TABLE "edu"."agent_return";
CREATE TABLE "edu"."agent_return" (
"agent_id" numeric(5) NOT NULL,
"ag_return_type_id" numeric(5) NOT NULL,
"batch_id" numeric(5) NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."agent_return" IS '招生点返利维护';

-- ----------------------------
-- Records of agent_return
-- ----------------------------
INSERT INTO "edu"."agent_return" VALUES ('11', '26', '1');
INSERT INTO "edu"."agent_return" VALUES ('11', '27', '1');
INSERT INTO "edu"."agent_return" VALUES ('12', '18', '1');
INSERT INTO "edu"."agent_return" VALUES ('12', '19', '1');
INSERT INTO "edu"."agent_return" VALUES ('12', '20', '1');
INSERT INTO "edu"."agent_return" VALUES ('12', '21', '1');

-- ----------------------------
-- Table structure for "edu"."agent_return_type"
-- ----------------------------
DROP TABLE "edu"."agent_return_type";
CREATE TABLE "edu"."agent_return_type" (
"ag_return_type_id" numeric(5) DEFAULT fun_table_seq('agent_return_type'::character varying, 'ag_return_type_id'::character varying, 'next'::character varying) NOT NULL,
"aggregation_desc" varchar(255) NOT NULL,
"fee_id" numeric(5) NOT NULL,
"register_date" timestamp(6) DEFAULT now() NOT NULL,
"update_date" timestamp(6)
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."agent_return_type" IS '招生点返利组合类型计算';

-- ----------------------------
-- Records of agent_return_type
-- ----------------------------
INSERT INTO "edu"."agent_return_type" VALUES ('18', '2012春-蝈蝈-代管费-浙江工业大学-江南大学-天津大学', '16', '2012-02-25 13:09:11.934297', '2012-02-25 13:10:26.364');
INSERT INTO "edu"."agent_return_type" VALUES ('19', '2012春-蝈蝈-学费-浙江工业大学-江南大学-天津大学', '5', '2012-02-25 13:09:16.49973', '2012-02-25 13:10:30.931');
INSERT INTO "edu"."agent_return_type" VALUES ('20', '2012春-蝈蝈-代管费-中国石油大学-郑州大学', '16', '2012-02-25 13:09:24.47817', '2012-02-25 13:10:38.909');
INSERT INTO "edu"."agent_return_type" VALUES ('21', '2012春-蝈蝈-学费-中国石油大学-郑州大学', '5', '2012-02-25 13:09:28.50895', '2012-02-25 13:10:42.941');
INSERT INTO "edu"."agent_return_type" VALUES ('26', '2012春-机构1-代管费-浙江工业大学-江南大学-天津大学-中国石油大学-郑州大学', '16', '2012-02-26 21:10:53.769734', '2012-02-26 21:12:15.935');
INSERT INTO "edu"."agent_return_type" VALUES ('27', '2012春-机构1-学费-浙江工业大学-江南大学-天津大学-中国石油大学-郑州大学', '5', '2012-02-26 21:11:05.30129', '2012-02-26 21:12:27.473');

-- ----------------------------
-- Table structure for "edu"."agent_type"
-- ----------------------------
DROP TABLE "edu"."agent_type";
CREATE TABLE "edu"."agent_type" (
"agent_type_id" numeric(5) DEFAULT fun_table_seq('agent_type'::character varying, 'agent_type_id'::character varying, 'next'::character varying) NOT NULL,
"agent_type_name" varchar(255) NOT NULL,
"is_return" bool NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."agent_type" IS '招生点类型';
COMMENT ON COLUMN "edu"."agent_type"."agent_type_id" IS '招生点类型代码';
COMMENT ON COLUMN "edu"."agent_type"."agent_type_name" IS '招生点类型名称';
COMMENT ON COLUMN "edu"."agent_type"."is_return" IS '是否有返利';

-- ----------------------------
-- Records of agent_type
-- ----------------------------
INSERT INTO "edu"."agent_type" VALUES ('3', '本部', 'f');
INSERT INTO "edu"."agent_type" VALUES ('4', '今明下属学校', 'f');
INSERT INTO "edu"."agent_type" VALUES ('5', '今明下属学校高校学习中心', 'f');
INSERT INTO "edu"."agent_type" VALUES ('6', '高校学习中心--合作', 't');
INSERT INTO "edu"."agent_type" VALUES ('7', '招生点', 't');

-- ----------------------------
-- Table structure for "edu"."agree_return"
-- ----------------------------
DROP TABLE "edu"."agree_return";
CREATE TABLE "edu"."agree_return" (
"agree_return_id" numeric(5) DEFAULT fun_table_seq('agree_return'::character varying, 'agree_return_id'::character varying, 'next'::character varying) NOT NULL,
"agree_return_name" varchar(255) NOT NULL,
"register_date" timestamp(6) DEFAULT now() NOT NULL,
"comment" text,
"agree_copy" bytea
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."agree_return" IS '招生点协议及返利系数管理';
COMMENT ON COLUMN "edu"."agree_return"."agree_return_id" IS '协议返利代码';
COMMENT ON COLUMN "edu"."agree_return"."agree_return_name" IS '返利名称';
COMMENT ON COLUMN "edu"."agree_return"."register_date" IS '录入时间';
COMMENT ON COLUMN "edu"."agree_return"."comment" IS '说明';
COMMENT ON COLUMN "edu"."agree_return"."agree_copy" IS '协议附件';

-- ----------------------------
-- Records of agree_return
-- ----------------------------

-- ----------------------------
-- Table structure for "edu"."bank_account"
-- ----------------------------
DROP TABLE "edu"."bank_account";
CREATE TABLE "edu"."bank_account" (
"agent_id" numeric(5) NOT NULL,
"college_id" numeric(5) NOT NULL,
"batch_id" numeric(5) NOT NULL,
"account" varchar(255) NOT NULL,
"register_date" timestamp(6) NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."bank_account" IS '银行帐号';
COMMENT ON COLUMN "edu"."bank_account"."account" IS '商户代码（银行帐号）';

-- ----------------------------
-- Records of bank_account
-- ----------------------------

-- ----------------------------
-- Table structure for "edu"."bank_order"
-- ----------------------------
DROP TABLE "edu"."bank_order";
CREATE TABLE "edu"."bank_order" (
"order_id" numeric(16) NOT NULL,
"charge_id" numeric(10) NOT NULL,
"is_paid" bool NOT NULL,
"bank_code" varchar(255) NOT NULL,
"remark" varchar(1500),
"register_date" timestamp(6) NOT NULL,
"user_id" numeric(5) NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."bank_order" IS '银行订单管理';

-- ----------------------------
-- Records of bank_order
-- ----------------------------

-- ----------------------------
-- Table structure for "edu"."batch_index"
-- ----------------------------
DROP TABLE "edu"."batch_index";
CREATE TABLE "edu"."batch_index" (
"batch_id" numeric(5) DEFAULT fun_table_seq('batch_index'::character varying, 'batch_id'::character varying, 'next'::character varying) NOT NULL,
"batch_name" varchar(255) NOT NULL,
"register_date" timestamp(6) DEFAULT now() NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."batch_index" IS '批次代码维护';
COMMENT ON COLUMN "edu"."batch_index"."batch_id" IS '批次代码';
COMMENT ON COLUMN "edu"."batch_index"."batch_name" IS '批次名称';
COMMENT ON COLUMN "edu"."batch_index"."register_date" IS '登记时间';

-- ----------------------------
-- Records of batch_index
-- ----------------------------
INSERT INTO "edu"."batch_index" VALUES ('1', '2012春', '2012-02-01 16:51:07.331');
INSERT INTO "edu"."batch_index" VALUES ('2', '2012秋', '2012-02-01 16:51:24.222');

-- ----------------------------
-- Table structure for "edu"."charge_admin"
-- ----------------------------
DROP TABLE "edu"."charge_admin";
CREATE TABLE "edu"."charge_admin" (
"charge_id" numeric(5) DEFAULT fun_table_seq('charge_admin'::character varying, 'charge_id'::character varying, 'next'::character varying) NOT NULL,
"student_id" numeric(5) NOT NULL,
"fee_id" numeric(5) NOT NULL,
"charge_type_id" numeric(5),
"bank_code" varchar(1024),
"amount_flag" bool NOT NULL,
"amount" numeric(10,2) NOT NULL,
"charge_time" timestamp(6) DEFAULT now() NOT NULL,
"remark" varchar(255),
"due_date" timestamp(6),
"agent_return_id" numeric(5)
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."charge_admin" IS '收费管理';
COMMENT ON COLUMN "edu"."charge_admin"."fee_id" IS '费用类型';
COMMENT ON COLUMN "edu"."charge_admin"."charge_type_id" IS '缴费方式';
COMMENT ON COLUMN "edu"."charge_admin"."bank_code" IS '银行交易信息';
COMMENT ON COLUMN "edu"."charge_admin"."amount_flag" IS 'true 应缴 ， false 已缴';
COMMENT ON COLUMN "edu"."charge_admin"."charge_time" IS '费用生成/缴纳时间';
COMMENT ON COLUMN "edu"."charge_admin"."due_date" IS '应收费用的截止时间';
COMMENT ON COLUMN "edu"."charge_admin"."agent_return_id" IS '已经生成的返利应付记录标识';

-- ----------------------------
-- Records of charge_admin
-- ----------------------------

-- ----------------------------
-- Table structure for "edu"."charge_type"
-- ----------------------------
DROP TABLE "edu"."charge_type";
CREATE TABLE "edu"."charge_type" (
"charge_type_id" numeric(5) DEFAULT fun_table_seq('charge_type'::character varying, 'charge_type_id'::character varying, 'next'::character varying) NOT NULL,
"charge_type_name" varchar(255) NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."charge_type" IS '收费类型';
COMMENT ON COLUMN "edu"."charge_type"."charge_type_id" IS '收费类型代码';
COMMENT ON COLUMN "edu"."charge_type"."charge_type_name" IS '收费类型名称';

-- ----------------------------
-- Records of charge_type
-- ----------------------------
INSERT INTO "edu"."charge_type" VALUES ('1', '网银');
INSERT INTO "edu"."charge_type" VALUES ('2', '汇款');
INSERT INTO "edu"."charge_type" VALUES ('3', '直缴');
INSERT INTO "edu"."charge_type" VALUES ('4', '代缴');

-- ----------------------------
-- Table structure for "edu"."co_college"
-- ----------------------------
DROP TABLE "edu"."co_college";
CREATE TABLE "edu"."co_college" (
"college_id" numeric(5) DEFAULT fun_table_seq('co_college'::character varying, 'college_id'::character varying, 'next'::character varying) NOT NULL,
"college_name" varchar(255) NOT NULL,
"register_date" timestamp(6) DEFAULT now() NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."co_college" IS '合作高校代码维护';
COMMENT ON COLUMN "edu"."co_college"."college_id" IS '学校代码';
COMMENT ON COLUMN "edu"."co_college"."college_name" IS '学校名称';
COMMENT ON COLUMN "edu"."co_college"."register_date" IS '登记时间';

-- ----------------------------
-- Records of co_college
-- ----------------------------
INSERT INTO "edu"."co_college" VALUES ('10', '郑州大学', '2012-02-09 21:46:58.866');
INSERT INTO "edu"."co_college" VALUES ('11', '中国石油大学', '2012-02-09 21:47:20.666427');
INSERT INTO "edu"."co_college" VALUES ('12', '天津大学', '2012-02-09 21:47:27.054694');
INSERT INTO "edu"."co_college" VALUES ('13', '江南大学', '2012-02-09 21:50:15.912');
INSERT INTO "edu"."co_college" VALUES ('15', '浙江工业大学', '2012-02-14 21:14:04.044665');

-- ----------------------------
-- Table structure for "edu"."college_aggregation"
-- ----------------------------
DROP TABLE "edu"."college_aggregation";
CREATE TABLE "edu"."college_aggregation" (
"ag_return_type_id" numeric(5) NOT NULL,
"college_id" numeric(5) NOT NULL,
"headcount" numeric(5) NOT NULL,
"return_percent" numeric(3,2) NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."college_aggregation" IS '招生点返利组合计算的高校';

-- ----------------------------
-- Records of college_aggregation
-- ----------------------------
INSERT INTO "edu"."college_aggregation" VALUES ('18', '12', '0', '0.10');
INSERT INTO "edu"."college_aggregation" VALUES ('18', '13', '0', '0.10');
INSERT INTO "edu"."college_aggregation" VALUES ('18', '15', '0', '0.10');
INSERT INTO "edu"."college_aggregation" VALUES ('19', '12', '0', '0.10');
INSERT INTO "edu"."college_aggregation" VALUES ('19', '13', '0', '0.10');
INSERT INTO "edu"."college_aggregation" VALUES ('19', '15', '0', '0.10');
INSERT INTO "edu"."college_aggregation" VALUES ('20', '10', '0', '0.10');
INSERT INTO "edu"."college_aggregation" VALUES ('20', '11', '0', '0.10');
INSERT INTO "edu"."college_aggregation" VALUES ('21', '10', '19', '0.12');
INSERT INTO "edu"."college_aggregation" VALUES ('21', '11', '0', '0.10');
INSERT INTO "edu"."college_aggregation" VALUES ('26', '10', '0', '0.10');
INSERT INTO "edu"."college_aggregation" VALUES ('26', '11', '0', '0.10');
INSERT INTO "edu"."college_aggregation" VALUES ('26', '12', '0', '0.10');
INSERT INTO "edu"."college_aggregation" VALUES ('26', '13', '0', '0.10');
INSERT INTO "edu"."college_aggregation" VALUES ('26', '15', '0', '0.10');
INSERT INTO "edu"."college_aggregation" VALUES ('26', '15', '100', '0.15');
INSERT INTO "edu"."college_aggregation" VALUES ('27', '10', '0', '0.10');
INSERT INTO "edu"."college_aggregation" VALUES ('27', '11', '0', '0.10');
INSERT INTO "edu"."college_aggregation" VALUES ('27', '12', '0', '0.10');
INSERT INTO "edu"."college_aggregation" VALUES ('27', '13', '0', '0.10');
INSERT INTO "edu"."college_aggregation" VALUES ('27', '15', '0', '0.10');
INSERT INTO "edu"."college_aggregation" VALUES ('27', '15', '100', '0.15');

-- ----------------------------
-- Table structure for "edu"."college_agreement"
-- ----------------------------
DROP TABLE "edu"."college_agreement";
CREATE TABLE "edu"."college_agreement" (
"agreement_id" numeric(5) DEFAULT fun_table_seq('college_agreement'::character varying, 'agreement_id'::character varying, 'next'::character varying) NOT NULL,
"agreement_name" varchar(255) NOT NULL,
"college_id" numeric(5) NOT NULL,
"agent_id" numeric(5) NOT NULL,
"agreement" bytea,
"agreement_status" bool NOT NULL,
"user_id" numeric(5) NOT NULL,
"register_date" timestamp(6) DEFAULT now() NOT NULL,
"update_date" timestamp(6) NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."college_agreement" IS '合作高校协议';
COMMENT ON COLUMN "edu"."college_agreement"."agreement_id" IS '协议代码';
COMMENT ON COLUMN "edu"."college_agreement"."college_id" IS '学校代码';
COMMENT ON COLUMN "edu"."college_agreement"."agent_id" IS '我方学校名称';
COMMENT ON COLUMN "edu"."college_agreement"."agreement" IS '协议内容';
COMMENT ON COLUMN "edu"."college_agreement"."agreement_status" IS '协议状态';
COMMENT ON COLUMN "edu"."college_agreement"."user_id" IS '处理人';
COMMENT ON COLUMN "edu"."college_agreement"."register_date" IS '登记时间';
COMMENT ON COLUMN "edu"."college_agreement"."update_date" IS '更改时间';

-- ----------------------------
-- Records of college_agreement
-- ----------------------------
INSERT INTO "edu"."college_agreement" VALUES ('5', 'POTATO平台介绍_SK电讯投资（中国）有限公司（大众版）.ppt.11_20120217_172501-applicationXYAZvndABXCmsUYXTpowerpoint', '10', '10', null, 't', '1234', '2012-02-17 17:25:01.621', '2012-02-17 17:25:01.621');
INSERT INTO "edu"."college_agreement" VALUES ('6', 'vnc-e4_5_3-x86_x64_win32.exe.10_20120218_225707-applicationXYAZoctetUYXTstream', '15', '10', null, 'f', '1234', '2012-02-18 22:57:07.425', '2012-02-18 22:57:07.425');
INSERT INTO "edu"."college_agreement" VALUES ('7', 'Expense-DB-Cross-Charge.xls.12_20120217_221514-applicationXYAZvndABXCmsUYXTexcel', '12', '10', null, 'f', '1234', '2012-02-17 22:15:14.555', '2012-02-17 22:15:14.555');
INSERT INTO "edu"."college_agreement" VALUES ('8', 'vnc-4_1_3-sparc_solaris.tar.gz.8_20120227_170531-applicationXYAZxUYXTgzip', '12', '12', null, 'f', '1', '2012-02-27 17:05:31.711', '2012-02-27 17:05:31.711');

-- ----------------------------
-- Table structure for "edu"."college_return"
-- ----------------------------
DROP TABLE "edu"."college_return";
CREATE TABLE "edu"."college_return" (
"agreement_id" numeric(5) NOT NULL,
"headcount" numeric(5) NOT NULL,
"batch_id" numeric(5) NOT NULL,
"fee_id" numeric(5) NOT NULL,
"return_percent" numeric(3,2) NOT NULL,
"register_date" timestamp(6) DEFAULT now() NOT NULL,
"update_date" timestamp(6)
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."college_return" IS '高校返利设置 --- 
今明从高校应收返利设置,由协议代码和人数确定一条有效记录';

-- ----------------------------
-- Records of college_return
-- ----------------------------

-- ----------------------------
-- Table structure for "edu"."college_subject"
-- ----------------------------
DROP TABLE "edu"."college_subject";
CREATE TABLE "edu"."college_subject" (
"college_id" numeric(5) NOT NULL,
"batch_id" numeric(5) NOT NULL,
"classified_id" numeric(5) NOT NULL,
"subeject_id" numeric(5) NOT NULL,
"length_of_schooling" numeric(1) NOT NULL,
"register_date" timestamp(6) DEFAULT now() NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."college_subject" IS '高校专业管理';
COMMENT ON COLUMN "edu"."college_subject"."college_id" IS '学校代码';
COMMENT ON COLUMN "edu"."college_subject"."batch_id" IS '批次代码';
COMMENT ON COLUMN "edu"."college_subject"."classified_id" IS '类别代码';
COMMENT ON COLUMN "edu"."college_subject"."subeject_id" IS '专业代码';
COMMENT ON COLUMN "edu"."college_subject"."length_of_schooling" IS '学年制';
COMMENT ON COLUMN "edu"."college_subject"."register_date" IS '登记时间';

-- ----------------------------
-- Records of college_subject
-- ----------------------------
INSERT INTO "edu"."college_subject" VALUES ('12', '1', '3', '28', '1', '2012-02-18 21:04:55.987283');
INSERT INTO "edu"."college_subject" VALUES ('12', '1', '3', '30', '1', '2012-02-18 21:04:55.987283');
INSERT INTO "edu"."college_subject" VALUES ('12', '1', '3', '32', '1', '2012-02-18 21:04:55.987283');
INSERT INTO "edu"."college_subject" VALUES ('12', '1', '3', '35', '1', '2012-02-18 21:04:55.987283');
INSERT INTO "edu"."college_subject" VALUES ('12', '1', '3', '36', '1', '2012-02-18 21:04:55.987283');
INSERT INTO "edu"."college_subject" VALUES ('12', '1', '3', '37', '1', '2012-02-18 21:04:55.987283');
INSERT INTO "edu"."college_subject" VALUES ('13', '1', '1', '34', '3', '2012-02-21 21:15:29.55892');
INSERT INTO "edu"."college_subject" VALUES ('13', '1', '1', '35', '3', '2012-02-21 21:15:29.55892');
INSERT INTO "edu"."college_subject" VALUES ('13', '1', '1', '39', '3', '2012-02-21 21:15:29.55892');
INSERT INTO "edu"."college_subject" VALUES ('13', '1', '1', '40', '3', '2012-02-21 21:15:29.55892');
INSERT INTO "edu"."college_subject" VALUES ('13', '1', '2', '12', '2', '2012-02-18 19:49:45.773194');
INSERT INTO "edu"."college_subject" VALUES ('13', '1', '2', '15', '2', '2012-02-18 19:49:45.773194');
INSERT INTO "edu"."college_subject" VALUES ('13', '1', '2', '16', '2', '2012-02-18 19:49:45.773194');
INSERT INTO "edu"."college_subject" VALUES ('13', '1', '7', '38', '2', '2012-02-18 20:43:23.650304');
INSERT INTO "edu"."college_subject" VALUES ('13', '1', '7', '40', '2', '2012-02-18 20:43:23.650304');
INSERT INTO "edu"."college_subject" VALUES ('13', '1', '7', '42', '2', '2012-02-18 20:43:23.650304');
INSERT INTO "edu"."college_subject" VALUES ('15', '1', '1', '21', '3', '2012-02-24 10:41:23.538867');
INSERT INTO "edu"."college_subject" VALUES ('15', '1', '2', '19', '2', '2012-02-17 14:22:35.266164');
INSERT INTO "edu"."college_subject" VALUES ('15', '1', '2', '44', '2', '2012-02-17 14:22:35.266164');
INSERT INTO "edu"."college_subject" VALUES ('15', '2', '2', '27', '3', '2012-02-14 21:54:08.687088');

-- ----------------------------
-- Table structure for "edu"."current_batch"
-- ----------------------------
DROP TABLE "edu"."current_batch";
CREATE TABLE "edu"."current_batch" (
"current_batch_id" numeric(5) NOT NULL,
"update_date" timestamp(6)
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."current_batch" IS '当前批次(只有一条记录，是为了数据录入服务）';

-- ----------------------------
-- Records of current_batch
-- ----------------------------
INSERT INTO "edu"."current_batch" VALUES ('1', '2012-02-16 22:32:22.665606');

-- ----------------------------
-- Table structure for "edu"."derate_request"
-- ----------------------------
DROP TABLE "edu"."derate_request";
CREATE TABLE "edu"."derate_request" (
"derate_id" numeric(5) DEFAULT fun_table_seq('derate_request'::character varying, 'derate_id'::character varying, 'next'::character varying) NOT NULL,
"student_id" numeric(5) NOT NULL,
"derate_fee" numeric(10,2) NOT NULL,
"derate_content" varchar(255),
"attachment" bytea,
"approve" bool,
"approve_by" varchar(255),
"user_id" numeric(5) NOT NULL,
"register_date" timestamp(6) DEFAULT now() NOT NULL,
"update_date" timestamp(6)
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."derate_request" IS '学生费用减免申请';
COMMENT ON COLUMN "edu"."derate_request"."derate_id" IS '减免代码';
COMMENT ON COLUMN "edu"."derate_request"."student_id" IS '学生代码';
COMMENT ON COLUMN "edu"."derate_request"."derate_fee" IS '减免费用';
COMMENT ON COLUMN "edu"."derate_request"."derate_content" IS '减免内容';
COMMENT ON COLUMN "edu"."derate_request"."attachment" IS '附件';
COMMENT ON COLUMN "edu"."derate_request"."approve" IS '是否批准';
COMMENT ON COLUMN "edu"."derate_request"."approve_by" IS '批准人';
COMMENT ON COLUMN "edu"."derate_request"."user_id" IS '处理人';
COMMENT ON COLUMN "edu"."derate_request"."register_date" IS '登记时间';
COMMENT ON COLUMN "edu"."derate_request"."update_date" IS '更改时间';

-- ----------------------------
-- Records of derate_request
-- ----------------------------

-- ----------------------------
-- Table structure for "edu"."entrance_cost"
-- ----------------------------
DROP TABLE "edu"."entrance_cost";
CREATE TABLE "edu"."entrance_cost" (
"college_id" numeric(5) NOT NULL,
"batch_id" numeric(5) NOT NULL,
"agent_id" numeric(5) NOT NULL,
"subject_id" numeric(5) NOT NULL,
"fee_id" numeric(5) NOT NULL,
"fee" numeric(10,2),
"register_date" timestamp(6) DEFAULT now() NOT NULL,
"classified_id" numeric(5) NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."entrance_cost" IS '入学费用标准设置';
COMMENT ON COLUMN "edu"."entrance_cost"."college_id" IS '学校代码';
COMMENT ON COLUMN "edu"."entrance_cost"."batch_id" IS '批次代码';
COMMENT ON COLUMN "edu"."entrance_cost"."agent_id" IS '学习中心代码';
COMMENT ON COLUMN "edu"."entrance_cost"."subject_id" IS '专业代码';
COMMENT ON COLUMN "edu"."entrance_cost"."fee_id" IS '费用类型';
COMMENT ON COLUMN "edu"."entrance_cost"."fee" IS '费用';
COMMENT ON COLUMN "edu"."entrance_cost"."register_date" IS '登记时间';
COMMENT ON COLUMN "edu"."entrance_cost"."classified_id" IS '层次';

-- ----------------------------
-- Records of entrance_cost
-- ----------------------------
INSERT INTO "edu"."entrance_cost" VALUES ('13', '1', '10', '34', '4', '250.00', '2012-02-23 11:37:55.951821', '1');
INSERT INTO "edu"."entrance_cost" VALUES ('13', '1', '10', '34', '5', '1000.00', '2012-02-23 11:37:55.951821', '1');
INSERT INTO "edu"."entrance_cost" VALUES ('13', '1', '10', '34', '13', '500.00', '2012-02-23 11:37:55.951821', '1');
INSERT INTO "edu"."entrance_cost" VALUES ('13', '1', '10', '35', '4', '250.00', '2012-02-23 11:37:55.951821', '1');
INSERT INTO "edu"."entrance_cost" VALUES ('13', '1', '10', '35', '5', '1000.00', '2012-02-23 11:37:55.951821', '1');
INSERT INTO "edu"."entrance_cost" VALUES ('13', '1', '10', '38', '4', '250.00', '2012-02-23 11:37:55.951821', '7');
INSERT INTO "edu"."entrance_cost" VALUES ('13', '1', '10', '38', '13', '500.00', '2012-02-23 11:37:55.951821', '7');
INSERT INTO "edu"."entrance_cost" VALUES ('13', '1', '10', '40', '4', '250.00', '2012-02-23 11:37:55.951821', '1');
INSERT INTO "edu"."entrance_cost" VALUES ('13', '1', '10', '40', '5', '1000.00', '2012-02-23 11:37:55.951821', '1');
INSERT INTO "edu"."entrance_cost" VALUES ('13', '1', '10', '40', '13', '500.00', '2012-02-23 11:37:55.951821', '1');
INSERT INTO "edu"."entrance_cost" VALUES ('13', '1', '11', '34', '4', '250.00', '2012-02-23 11:37:55.951821', '1');
INSERT INTO "edu"."entrance_cost" VALUES ('13', '1', '11', '35', '4', '250.00', '2012-02-23 11:37:55.951821', '1');
INSERT INTO "edu"."entrance_cost" VALUES ('13', '1', '11', '35', '5', '1000.00', '2012-02-23 11:37:55.951821', '1');
INSERT INTO "edu"."entrance_cost" VALUES ('13', '1', '11', '38', '4', '250.00', '2012-02-23 11:37:55.951821', '7');
INSERT INTO "edu"."entrance_cost" VALUES ('13', '1', '11', '38', '5', '1000.00', '2012-02-23 11:37:55.951821', '7');
INSERT INTO "edu"."entrance_cost" VALUES ('13', '1', '11', '40', '4', '250.00', '2012-02-23 11:37:55.951821', '1');
INSERT INTO "edu"."entrance_cost" VALUES ('13', '1', '11', '40', '5', '1000.00', '2012-02-23 11:37:55.951821', '1');
INSERT INTO "edu"."entrance_cost" VALUES ('15', '2', '10', '27', '4', '300.00', '2012-02-23 11:46:55.407691', '2');

-- ----------------------------
-- Table structure for "edu"."fee_type"
-- ----------------------------
DROP TABLE "edu"."fee_type";
CREATE TABLE "edu"."fee_type" (
"fee_id" numeric(5) DEFAULT fun_table_seq('fee_type'::character varying, 'fee_id'::character varying, 'next'::character varying) NOT NULL,
"fee_name" varchar(255) NOT NULL,
"split_by_year" bool DEFAULT false,
"charge_by_end" bool DEFAULT false,
"can_return" bool
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."fee_type" IS '费用类型';
COMMENT ON COLUMN "edu"."fee_type"."fee_id" IS '费用代码';
COMMENT ON COLUMN "edu"."fee_type"."fee_name" IS '费用名称';
COMMENT ON COLUMN "edu"."fee_type"."split_by_year" IS '是否每年收取(如果是，则生成费用时，按年生成）';
COMMENT ON COLUMN "edu"."fee_type"."charge_by_end" IS '是否在期末收取（例如，专科两年，毕业费在两年之后收取）';
COMMENT ON COLUMN "edu"."fee_type"."can_return" IS '是否涉及返利计算';

-- ----------------------------
-- Records of fee_type
-- ----------------------------
INSERT INTO "edu"."fee_type" VALUES ('4', '报名考试费', 'f', 'f', 'f');
INSERT INTO "edu"."fee_type" VALUES ('5', '学费', 't', 'f', 't');
INSERT INTO "edu"."fee_type" VALUES ('13', '杂费', 't', 'f', 'f');
INSERT INTO "edu"."fee_type" VALUES ('14', '毕业费', 'f', 't', 'f');
INSERT INTO "edu"."fee_type" VALUES ('16', '代管费', 'f', 'f', 't');

-- ----------------------------
-- Table structure for "edu"."INMEMDB_POOL_DO_NOT_DELETE"
-- ----------------------------
DROP TABLE "edu"."INMEMDB_POOL_DO_NOT_DELETE";
CREATE TABLE "edu"."INMEMDB_POOL_DO_NOT_DELETE" (
"a" char(1)
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of INMEMDB_POOL_DO_NOT_DELETE
-- ----------------------------

-- ----------------------------
-- Table structure for "edu"."messages"
-- ----------------------------
DROP TABLE "edu"."messages";
CREATE TABLE "edu"."messages" (
"message_id" numeric(10) DEFAULT fun_table_seq('messages'::character varying, 'message_id'::character varying, 'next'::character varying) NOT NULL,
"from_user" numeric(5) NOT NULL,
"to_user" numeric(5) NOT NULL,
"message" varchar(1024) NOT NULL,
"is_read" bool DEFAULT false NOT NULL,
"receive_tstp" timestamp(6) DEFAULT now() NOT NULL,
"read_tstp" timestamp(6)
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of messages
-- ----------------------------
INSERT INTO "edu"."messages" VALUES ('1', '1', '2', 'test', 't', '2012-02-28 14:42:19', '2012-02-28 21:52:23.472');
INSERT INTO "edu"."messages" VALUES ('2', '2', '1', 'Test 2 to 1', 't', '2012-02-28 14:41:59.003632', '2012-02-28 21:48:59.166');
INSERT INTO "edu"."messages" VALUES ('3', '2', '1', '回复内容', 't', '2012-02-28 17:45:08.364268', '2012-02-28 21:48:59.157');
INSERT INTO "edu"."messages" VALUES ('4', '1', '2', '回复内容<br><font style="color: rgb(255, 0, 0);" size="3">这是一个测试阿</font><br>', 't', '2012-02-28 17:49:05.390707', '2012-02-28 21:52:23.478');
INSERT INTO "edu"."messages" VALUES ('5', '2', '1', '<br>', 't', '2012-02-28 21:16:44.338602', '2012-02-28 21:48:59.174');
INSERT INTO "edu"."messages" VALUES ('6', '2', '1', '<br>', 't', '2012-02-28 21:16:52.885104', '2012-02-28 21:48:59.178');
INSERT INTO "edu"."messages" VALUES ('7', '1', '2', 'ssfasf', 't', '2012-02-28 21:22:14.607826', '2012-02-28 21:52:23.485');
INSERT INTO "edu"."messages" VALUES ('8', '1', '2', 'asasdf', 't', '2012-02-28 21:23:24.677488', '2012-02-28 21:52:23.497');
INSERT INTO "edu"."messages" VALUES ('9', '1', '2', 'tset', 't', '2012-02-28 21:23:28.763884', '2012-02-28 21:52:23.505');
INSERT INTO "edu"."messages" VALUES ('10', '1', '2', '<font size="7">ssdf<span style="color: rgb(255, 0, 255);">affs</span></font>', 't', '2012-02-28 21:23:41.257606', '2012-02-28 22:03:00.499');
INSERT INTO "edu"."messages" VALUES ('11', '2', '1', 'Grails + SmartGWT pluginpermalink.gmane.org/gmane.comp.lang.groovy.../90477 - 翻译此页<br>您已公开地对此项 +1。 撤消<br>30 Jun 2010 – I''ve created a plugin called SmartGWT but it''s pretty straightforward . ... objects, so it makes parsing the schema on the client side a snap, as ...<br>January 2010 - GUI, GWT, GXT, SmartGWT, GWT-Ext, JAVA SWING ...ui-programming.blogspot.com/2010_01_01_arch... - 网页快照类似结果 - 翻译此页<br>您已公开地对此项 +1。 撤消<br>1 Jan 2010 – The Ext GWT, SmartGWT and GWT-Ext are the most used and cool widget ..... The SNAP Mobile SDK 2.2 provides developers with a number of ...<br>smartgwt snap的相关搜索<br><br>', 't', '2012-02-28 21:24:30.241027', '2012-02-28 21:48:59.205');
INSERT INTO "edu"."messages" VALUES ('12', '2', '1', 'test <span style="color: rgb(255, 153, 204);">sssdf <font size="6">sddsfasf</font></span><br>', 't', '2012-02-28 21:27:04.717153', '2012-02-28 21:48:59.208');
INSERT INTO "edu"."messages" VALUES ('13', '2', '1', 'test', 't', '2012-02-28 22:01:25.140288', '2012-02-28 22:03:57.394');
INSERT INTO "edu"."messages" VALUES ('14', '1', '1', 'test <br>', 't', '2012-02-28 22:45:53.961407', '2012-02-28 22:47:55.107');
INSERT INTO "edu"."messages" VALUES ('15', '1', '1', 'fg&nbsp; sdf<br>', 't', '2012-02-28 22:46:19.428191', '2012-02-28 22:48:53.7');
INSERT INTO "edu"."messages" VALUES ('16', '1', '1', 'test', 't', '2012-02-28 22:47:18.014918', '2012-02-28 22:59:46.866');
INSERT INTO "edu"."messages" VALUES ('17', '1', '1', 'test', 't', '2012-02-28 22:57:33.635582', '2012-02-28 23:01:00.568');
INSERT INTO "edu"."messages" VALUES ('18', '1', '1', 'testtest', 't', '2012-02-28 22:57:42.59186', '2012-02-28 23:01:00.543');
INSERT INTO "edu"."messages" VALUES ('19', '1', '1', 'testtest', 't', '2012-02-28 22:58:01.321028', '2012-02-28 23:01:00.55');
INSERT INTO "edu"."messages" VALUES ('20', '1', '1', 'testtest', 't', '2012-02-28 22:58:01.338533', '2012-02-28 23:01:00.556');
INSERT INTO "edu"."messages" VALUES ('21', '1', '1', 'testtest', 't', '2012-02-28 22:58:08.069987', '2012-02-28 23:01:00.562');
INSERT INTO "edu"."messages" VALUES ('22', '1', '1', 'testtest', 't', '2012-02-28 22:58:08.092663', '2012-02-28 23:01:00.573');
INSERT INTO "edu"."messages" VALUES ('23', '1', '1', 'testtest', 't', '2012-02-28 22:58:14.092598', '2012-02-28 23:01:00.473');
INSERT INTO "edu"."messages" VALUES ('24', '1', '1', 'testtest', 't', '2012-02-28 22:58:14.111899', '2012-02-28 23:01:00.478');
INSERT INTO "edu"."messages" VALUES ('25', '1', '1', 'testtest', 't', '2012-02-28 22:58:14.122697', '2012-02-28 23:01:00.484');
INSERT INTO "edu"."messages" VALUES ('26', '1', '1', 'testtestcrr', 't', '2012-02-28 22:58:22.428121', '2012-02-28 23:01:00.489');
INSERT INTO "edu"."messages" VALUES ('27', '1', '1', 'testtestcrr', 't', '2012-02-28 22:58:22.451827', '2012-02-28 23:01:00.495');
INSERT INTO "edu"."messages" VALUES ('28', '1', '1', 'testtestcrr', 't', '2012-02-28 22:58:28.16438', '2012-02-28 23:01:00.501');
INSERT INTO "edu"."messages" VALUES ('29', '1', '1', 'testtestcrr', 't', '2012-02-28 22:58:28.188337', '2012-02-28 23:01:00.508');
INSERT INTO "edu"."messages" VALUES ('30', '1', '1', 'testtestcrr', 't', '2012-02-28 22:58:28.202109', '2012-02-28 23:01:00.513');
INSERT INTO "edu"."messages" VALUES ('31', '1', '1', 'testtestcrrsdf', 't', '2012-02-28 22:58:34.922623', '2012-02-28 23:01:00.52');
INSERT INTO "edu"."messages" VALUES ('32', '1', '1', 'testtestcrrsdf', 't', '2012-02-28 22:58:34.953469', '2012-02-28 23:01:00.525');
INSERT INTO "edu"."messages" VALUES ('33', '1', '1', 'testtestcrrsdf', 't', '2012-02-28 22:58:34.960204', '2012-02-28 23:01:00.531');
INSERT INTO "edu"."messages" VALUES ('34', '1', '1', 'testtestcrrsdf', 't', '2012-02-28 22:58:34.974084', '2012-02-28 23:01:00.538');
INSERT INTO "edu"."messages" VALUES ('35', '1', '2', '测试2', 't', '2012-02-28 23:09:32.194002', '2012-02-29 00:29:42.506');
INSERT INTO "edu"."messages" VALUES ('36', '1', '1', '测试1', 't', '2012-02-28 23:09:44.306807', '2012-02-28 23:13:57');
INSERT INTO "edu"."messages" VALUES ('37', '1', '1', 'nw', 't', '2012-02-28 23:11:25.460114', '2012-02-28 23:13:58.447');
INSERT INTO "edu"."messages" VALUES ('38', '1', '1', 'nw', 't', '2012-02-28 23:11:29.481243', '2012-02-28 23:13:59.608');
INSERT INTO "edu"."messages" VALUES ('39', '1', '1', 'nw', 't', '2012-02-28 23:11:29.501975', '2012-02-28 23:14:00.62');
INSERT INTO "edu"."messages" VALUES ('40', '1', '1', 'nw', 't', '2012-02-28 23:11:35.52751', '2012-02-28 23:14:04.958');
INSERT INTO "edu"."messages" VALUES ('41', '1', '1', 'nw', 't', '2012-02-28 23:11:35.563747', '2012-02-28 23:14:06.458');
INSERT INTO "edu"."messages" VALUES ('42', '1', '1', 'nw', 't', '2012-02-28 23:11:35.586005', '2012-02-28 23:14:07.848');
INSERT INTO "edu"."messages" VALUES ('43', '1', '1', 'nw', 't', '2012-02-28 23:11:40.974061', '2012-02-28 23:14:09.502');
INSERT INTO "edu"."messages" VALUES ('44', '1', '1', 'nw', 't', '2012-02-28 23:11:41.010535', '2012-02-28 23:14:02.382');
INSERT INTO "edu"."messages" VALUES ('45', '1', '1', 'nw', 't', '2012-02-28 23:11:41.027401', '2012-02-28 23:14:01.424');
INSERT INTO "edu"."messages" VALUES ('46', '1', '1', 'nw', 't', '2012-02-28 23:12:40.685406', '2012-02-28 23:18:45.898');
INSERT INTO "edu"."messages" VALUES ('47', '1', '1', 'nw', 't', '2012-02-28 23:12:48.44639', '2012-02-28 23:18:44.689');
INSERT INTO "edu"."messages" VALUES ('48', '1', '1', 'test', 't', '2012-02-28 23:16:23.16812', '2012-02-28 23:18:34.715');
INSERT INTO "edu"."messages" VALUES ('49', '1', '1', 'test', 't', '2012-02-28 23:16:24.228239', '2012-02-28 23:18:38.138');
INSERT INTO "edu"."messages" VALUES ('50', '1', '1', 'test', 't', '2012-02-28 23:16:25.244686', '2012-02-28 23:18:33.215');
INSERT INTO "edu"."messages" VALUES ('51', '1', '1', 'test', 't', '2012-02-28 23:16:26.284177', '2012-02-28 23:18:39.876');
INSERT INTO "edu"."messages" VALUES ('52', '1', '1', 'test', 't', '2012-02-28 23:16:34.635638', '2012-02-28 23:18:32.051');
INSERT INTO "edu"."messages" VALUES ('53', '1', '1', 'test', 't', '2012-02-28 23:16:35.666044', '2012-02-28 23:18:42.258');
INSERT INTO "edu"."messages" VALUES ('54', '1', '1', 'test', 't', '2012-02-28 23:16:36.678013', '2012-02-28 23:18:30.426');
INSERT INTO "edu"."messages" VALUES ('55', '1', '1', 'test', 't', '2012-02-28 23:16:37.69322', '2012-02-28 23:18:43.475');
INSERT INTO "edu"."messages" VALUES ('56', '1', '2', '特斯塔', 't', '2012-02-28 23:17:28.000932', '2012-02-29 00:29:41.133');
INSERT INTO "edu"."messages" VALUES ('57', '1', '2', '特色', 't', '2012-02-28 23:17:34.946085', '2012-02-29 00:29:40.053');
INSERT INTO "edu"."messages" VALUES ('58', '1', '2', '特斯塔', 't', '2012-02-28 23:17:41.02101', '2012-02-29 00:29:39.392');
INSERT INTO "edu"."messages" VALUES ('59', '1', '2', '特斯塔', 't', '2012-02-28 23:17:41.033177', '2012-02-29 00:29:39.103');
INSERT INTO "edu"."messages" VALUES ('60', '1', '2', '特斯图塔', 't', '2012-02-28 23:17:46.864284', '2012-02-29 00:29:38.465');
INSERT INTO "edu"."messages" VALUES ('61', '1', '2', '特斯图塔', 't', '2012-02-28 23:17:46.884595', '2012-02-29 00:29:38.133');
INSERT INTO "edu"."messages" VALUES ('62', '1', '2', '忽然人', 't', '2012-02-28 23:17:56.996714', '2012-02-29 00:29:37.623');
INSERT INTO "edu"."messages" VALUES ('63', '1', '1', '特斯塔', 't', '2012-02-28 23:18:14.121929', '2012-02-28 23:57:44.283');
INSERT INTO "edu"."messages" VALUES ('64', '1', '1', '特斯塔', 't', '2012-02-28 23:18:19.042605', '2012-02-28 23:57:43.522');
INSERT INTO "edu"."messages" VALUES ('65', '1', '1', '特斯塔', 't', '2012-02-28 23:18:19.050554', '2012-02-28 23:57:42.78');
INSERT INTO "edu"."messages" VALUES ('66', '1', '1', '铁塔额头', 't', '2012-02-28 23:18:24.212732', '2012-02-28 23:57:41.952');
INSERT INTO "edu"."messages" VALUES ('67', '1', '1', '塔额头 <br>', 't', '2012-02-28 23:18:29.034108', '2012-02-28 23:57:41.094');
INSERT INTO "edu"."messages" VALUES ('68', '1', '1', '塔额头 <br>', 't', '2012-02-28 23:18:29.050273', '2012-02-28 23:57:40.158');
INSERT INTO "edu"."messages" VALUES ('69', '1', '1', '所得发送放倒', 't', '2012-02-28 23:18:36.870281', '2012-02-28 23:57:39.207');
INSERT INTO "edu"."messages" VALUES ('70', '1', '1', '所得发送放倒', 't', '2012-02-28 23:18:36.891124', '2012-02-28 23:57:38.357');
INSERT INTO "edu"."messages" VALUES ('71', '1', '1', '所得发送放倒', 't', '2012-02-28 23:18:36.899038', '2012-02-28 23:57:37.298');
INSERT INTO "edu"."messages" VALUES ('72', '1', '1', '反腐防', 't', '2012-02-28 23:21:12.658642', '2012-02-28 23:57:36.265');
INSERT INTO "edu"."messages" VALUES ('73', '1', '1', '反腐', 't', '2012-02-28 23:21:22.021502', '2012-02-28 23:57:35.107');
INSERT INTO "edu"."messages" VALUES ('74', '1', '1', '图塔同', 't', '2012-02-28 23:29:42.546119', '2012-02-28 23:57:34.095');
INSERT INTO "edu"."messages" VALUES ('75', '1', '1', '琐琐碎碎', 't', '2012-02-28 23:29:47.957215', '2012-02-28 23:57:32.895');
INSERT INTO "edu"."messages" VALUES ('76', '1', '2', '你好', 't', '2012-02-28 23:31:54.196721', '2012-02-29 00:29:36.929');
INSERT INTO "edu"."messages" VALUES ('77', '1', '1', '很好', 't', '2012-02-28 23:32:03.600768', '2012-02-28 23:57:31.66');
INSERT INTO "edu"."messages" VALUES ('78', '1', '1', 'test <br>', 't', '2012-02-29 00:14:42.988744', '2012-02-29 00:16:30.461');
INSERT INTO "edu"."messages" VALUES ('79', '1', '1', 'test', 't', '2012-02-29 00:16:07.133284', '2012-02-29 00:17:54.258');
INSERT INTO "edu"."messages" VALUES ('80', '1', '1', 'test', 't', '2012-02-29 00:18:07.233389', '2012-02-29 00:20:09.602');
INSERT INTO "edu"."messages" VALUES ('81', '1', '1', 'tttttt', 't', '2012-02-29 00:18:54.541726', '2012-02-29 00:54:43.823');
INSERT INTO "edu"."messages" VALUES ('82', '2', '1', '3. Text Extractor Factory - POI 3.5 or later<br>A new class in POI 3.5, org.apache.poi.extractor.ExtractorFactory provides a similar<br>function to WorkbookFactory. You simply pass it an InputStream, a file, a POIFSFileSystem<br>or a OOXML Package. It figures out the correct text extractor for you, and returns it.', 't', '2012-02-29 00:29:00.817826', '2012-02-29 00:39:54.841');
INSERT INTO "edu"."messages" VALUES ('83', '1', '1', '3. Text Extractor Factory - POI 3.5 or later<br>A new class in POI 3.5, org.apache.poi.extractor.ExtractorFactory provides a similar<br>function to WorkbookFactory. You simply pass it an InputStream, a file, a POIFSFileSystem<br>or a OOXML Package. It figures out the correct text extractor for you, and returns it.', 't', '2012-02-29 00:38:34.530447', '2012-02-29 00:54:44.774');
INSERT INTO "edu"."messages" VALUES ('84', '2', '1', '3. Text Extractor Factory - POI 3.5 or later<br>A new class in POI 3.5, org.apache.poi.extractor.ExtractorFactory provides a similar<br>function to WorkbookFactory. You simply pass it an InputStream, a file, a POIFSFileSystem<br>or a OOXML Package. It figures out the correct text extractor for you, and returns it.', 'f', '2012-02-29 00:38:56.678369', null);

-- ----------------------------
-- Table structure for "edu"."pic_type"
-- ----------------------------
DROP TABLE "edu"."pic_type";
CREATE TABLE "edu"."pic_type" (
"pic_type_id" numeric(5) DEFAULT fun_table_seq('pic_type'::character varying, 'pic_type_id'::character varying, 'next'::character varying) NOT NULL,
"pic_type_name" varchar(255) NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."pic_type" IS '照片类型';

-- ----------------------------
-- Records of pic_type
-- ----------------------------
INSERT INTO "edu"."pic_type" VALUES ('1', '身份证');
INSERT INTO "edu"."pic_type" VALUES ('2', '个人免冠照');
INSERT INTO "edu"."pic_type" VALUES ('3', '毕业证书');
INSERT INTO "edu"."pic_type" VALUES ('5', '网站截图');

-- ----------------------------
-- Table structure for "edu"."recruit_agent"
-- ----------------------------
DROP TABLE "edu"."recruit_agent";
CREATE TABLE "edu"."recruit_agent" (
"agent_id" numeric(5) DEFAULT fun_table_seq('recruit_agent'::character varying, 'agent_id'::character varying, 'next'::character varying) NOT NULL,
"agent_name" varchar(255) NOT NULL,
"agent_type_id" numeric(5) NOT NULL,
"responsible_person" varchar(255),
"contact_person" varchar(255),
"contact_address" varchar(255),
"contact_phone" varchar(255),
"contact_mobile" varchar(255),
"account_name" varchar(255),
"bank_name" varchar(255),
"bank_account" varchar(255),
"remark" text,
"user_id" numeric(5) NOT NULL,
"college_url" varchar(255),
"userid_for_college" varchar(255),
"password_for_college" varchar(255),
"register_date" timestamp(6) DEFAULT now() NOT NULL,
"parent_agent_id" numeric(5)
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."recruit_agent" IS '招生点信息管理';
COMMENT ON COLUMN "edu"."recruit_agent"."agent_id" IS '招生点代码';
COMMENT ON COLUMN "edu"."recruit_agent"."agent_name" IS '招生点名称';
COMMENT ON COLUMN "edu"."recruit_agent"."agent_type_id" IS '招生点类型';
COMMENT ON COLUMN "edu"."recruit_agent"."responsible_person" IS '负责人';
COMMENT ON COLUMN "edu"."recruit_agent"."contact_person" IS '联系人';
COMMENT ON COLUMN "edu"."recruit_agent"."contact_address" IS '地址';
COMMENT ON COLUMN "edu"."recruit_agent"."contact_phone" IS '电话';
COMMENT ON COLUMN "edu"."recruit_agent"."contact_mobile" IS '手机';
COMMENT ON COLUMN "edu"."recruit_agent"."account_name" IS '账户名称';
COMMENT ON COLUMN "edu"."recruit_agent"."bank_name" IS '开户行';
COMMENT ON COLUMN "edu"."recruit_agent"."bank_account" IS '银行账户';
COMMENT ON COLUMN "edu"."recruit_agent"."remark" IS '备注';
COMMENT ON COLUMN "edu"."recruit_agent"."user_id" IS '录入人';
COMMENT ON COLUMN "edu"."recruit_agent"."college_url" IS '高校连接';
COMMENT ON COLUMN "edu"."recruit_agent"."userid_for_college" IS '学习中心在合作高校的用户名';
COMMENT ON COLUMN "edu"."recruit_agent"."password_for_college" IS '学习中心在合作高校的密码';
COMMENT ON COLUMN "edu"."recruit_agent"."register_date" IS '登记时间';
COMMENT ON COLUMN "edu"."recruit_agent"."parent_agent_id" IS '隶属机构';

-- ----------------------------
-- Records of recruit_agent
-- ----------------------------
INSERT INTO "edu"."recruit_agent" VALUES ('10', '机构0', '4', 'ert', null, null, null, 'sdf', null, 'sf', null, null, '1234', null, 'sdf', 'sdf', '2012-02-14 20:03:07.407', null);
INSERT INTO "edu"."recruit_agent" VALUES ('11', '机构1', '6', '123xxx', null, null, null, null, null, null, null, null, '1234', null, null, null, '2012-02-22 00:10:32.831', '10');
INSERT INTO "edu"."recruit_agent" VALUES ('12', '蝈蝈', '7', null, null, null, null, null, null, null, null, null, '1234', null, null, null, '2012-02-24 16:31:29.3415', null);
INSERT INTO "edu"."recruit_agent" VALUES ('13', 'abc', '3', null, null, null, null, null, null, null, null, null, '1234', null, null, null, '2012-02-25 11:07:06.794', '12');
INSERT INTO "edu"."recruit_agent" VALUES ('15', 'sssssxxx', '5', null, null, null, null, null, null, null, null, null, '1', null, null, null, '2012-02-29 09:48:12.68', '12');

-- ----------------------------
-- Table structure for "edu"."refundment_admin"
-- ----------------------------
DROP TABLE "edu"."refundment_admin";
CREATE TABLE "edu"."refundment_admin" (
"refund_id" numeric(5) DEFAULT fun_table_seq('refundment_admin'::character varying, 'refund_id'::character varying, 'next'::character varying) NOT NULL,
"student_id" numeric(5) NOT NULL,
"refund_fee" numeric(10,2) NOT NULL,
"refund_desc" text NOT NULL,
"refund_flag" bool NOT NULL,
"user_id" numeric(5) NOT NULL,
"register_date" timestamp(6) DEFAULT now() NOT NULL,
"update_date" timestamp(6)
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."refundment_admin" IS '退费审核';
COMMENT ON COLUMN "edu"."refundment_admin"."refund_id" IS '退费序号';
COMMENT ON COLUMN "edu"."refundment_admin"."student_id" IS '学生代码';
COMMENT ON COLUMN "edu"."refundment_admin"."refund_fee" IS '退费';
COMMENT ON COLUMN "edu"."refundment_admin"."refund_desc" IS '退费说明';
COMMENT ON COLUMN "edu"."refundment_admin"."refund_flag" IS '退费审批';
COMMENT ON COLUMN "edu"."refundment_admin"."user_id" IS '退费处理人';
COMMENT ON COLUMN "edu"."refundment_admin"."register_date" IS '登记时间';
COMMENT ON COLUMN "edu"."refundment_admin"."update_date" IS '更改时间';

-- ----------------------------
-- Records of refundment_admin
-- ----------------------------

-- ----------------------------
-- Table structure for "edu"."rights_category"
-- ----------------------------
DROP TABLE "edu"."rights_category";
CREATE TABLE "edu"."rights_category" (
"category_id" varchar(255) NOT NULL,
"category_name" varchar(255) NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON COLUMN "edu"."rights_category"."category_id" IS '权限类别';
COMMENT ON COLUMN "edu"."rights_category"."category_name" IS '权限类别名称';

-- ----------------------------
-- Records of rights_category
-- ----------------------------
INSERT INTO "edu"."rights_category" VALUES ('financial_manage', '财务管理');
INSERT INTO "edu"."rights_category" VALUES ('student_manage', '学生管理');
INSERT INTO "edu"."rights_category" VALUES ('student_personal', '功能导航(学生)');
INSERT INTO "edu"."rights_category" VALUES ('system_manage', '系统管理');

-- ----------------------------
-- Table structure for "edu"."rights_category_function"
-- ----------------------------
DROP TABLE "edu"."rights_category_function";
CREATE TABLE "edu"."rights_category_function" (
"category_id" varchar(255) NOT NULL,
"function_id" varchar(255) NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of rights_category_function
-- ----------------------------
INSERT INTO "edu"."rights_category_function" VALUES ('financial_manage', 'agent_bank_account_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('financial_manage', 'agent_financial_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('financial_manage', 'charge_batch_credit');
INSERT INTO "edu"."rights_category_function" VALUES ('financial_manage', 'charge_batch_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('financial_manage', 'charge_query');
INSERT INTO "edu"."rights_category_function" VALUES ('financial_manage', 'charge_type_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('financial_manage', 'college_return_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('financial_manage', 'entrance_cost_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('financial_manage', 'refund_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('student_manage', 'agent_return_query');
INSERT INTO "edu"."rights_category_function" VALUES ('student_manage', 'student_batch_import');
INSERT INTO "edu"."rights_category_function" VALUES ('student_manage', 'student_change_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('student_manage', 'student_derate_request');
INSERT INTO "edu"."rights_category_function" VALUES ('student_manage', 'student_register');
INSERT INTO "edu"."rights_category_function" VALUES ('system_manage', 'agent_agreement_fee_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('system_manage', 'agent_bank_account_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('system_manage', 'agent_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('system_manage', 'agent_type_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('system_manage', 'batch_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('system_manage', 'charge_type_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('system_manage', 'college_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('system_manage', 'college_return_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('system_manage', 'default_rights_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('system_manage', 'entrance_cost_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('system_manage', 'fee_type_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('system_manage', 'pic_type_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('system_manage', 'recurit_plan_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('system_manage', 'rights_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('system_manage', 'student_class_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('system_manage', 'student_status_type_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('system_manage', 'student_type_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('system_manage', 'user_manage');
INSERT INTO "edu"."rights_category_function" VALUES ('system_manage', 'user_type_manage');

-- ----------------------------
-- Table structure for "edu"."rights_default"
-- ----------------------------
DROP TABLE "edu"."rights_default";
CREATE TABLE "edu"."rights_default" (
"user_type_id" numeric(5) NOT NULL,
"category_id" varchar(255) NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of rights_default
-- ----------------------------
INSERT INTO "edu"."rights_default" VALUES ('1', 'system_manage');
INSERT INTO "edu"."rights_default" VALUES ('2', 'student_personal');
INSERT INTO "edu"."rights_default" VALUES ('3', 'financial_manage');
INSERT INTO "edu"."rights_default" VALUES ('3', 'student_manage');
INSERT INTO "edu"."rights_default" VALUES ('4', 'student_manage');
INSERT INTO "edu"."rights_default" VALUES ('5', 'student_manage');
INSERT INTO "edu"."rights_default" VALUES ('6', 'student_manage');

-- ----------------------------
-- Table structure for "edu"."rights_function"
-- ----------------------------
DROP TABLE "edu"."rights_function";
CREATE TABLE "edu"."rights_function" (
"function_id" varchar(255) NOT NULL,
"function_name" varchar(255) NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON COLUMN "edu"."rights_function"."function_id" IS '功能id';
COMMENT ON COLUMN "edu"."rights_function"."function_name" IS '功能名称';

-- ----------------------------
-- Records of rights_function
-- ----------------------------
INSERT INTO "edu"."rights_function" VALUES ('agent_agreement_fee_manage', '招生点协议及返利系数管理');
INSERT INTO "edu"."rights_function" VALUES ('agent_bank_account_manage', '学生打款账号维护');
INSERT INTO "edu"."rights_function" VALUES ('agent_financial_manage', '招生点返利统计管理');
INSERT INTO "edu"."rights_function" VALUES ('agent_manage', '机构维护');
INSERT INTO "edu"."rights_function" VALUES ('agent_return_query', '返利查询');
INSERT INTO "edu"."rights_function" VALUES ('agent_type_manage', '机构类型维护');
INSERT INTO "edu"."rights_function" VALUES ('batch_manage', '批次代码维护');
INSERT INTO "edu"."rights_function" VALUES ('charge_batch_credit', '批量生成已收费记录');
INSERT INTO "edu"."rights_function" VALUES ('charge_batch_manage', '批量生成学生应收费用');
INSERT INTO "edu"."rights_function" VALUES ('charge_query', '查看学生缴费情况');
INSERT INTO "edu"."rights_function" VALUES ('charge_type_manage', '入账方式维护');
INSERT INTO "edu"."rights_function" VALUES ('college_manage', '合作高校代码维护');
INSERT INTO "edu"."rights_function" VALUES ('college_return_manage', '高校返利（对今明）标准设置');
INSERT INTO "edu"."rights_function" VALUES ('default_rights_manage', '缺省权限设置');
INSERT INTO "edu"."rights_function" VALUES ('entrance_cost_manage', '入学费用标准设置');
INSERT INTO "edu"."rights_function" VALUES ('fee_type_manage', '费用类型维护');
INSERT INTO "edu"."rights_function" VALUES ('pic_type_manage', '照片类型维护');
INSERT INTO "edu"."rights_function" VALUES ('recurit_plan_manage', '招生计划管理');
INSERT INTO "edu"."rights_function" VALUES ('refund_manage', '退费管理');
INSERT INTO "edu"."rights_function" VALUES ('rights_manage', '权限基础数据设置');
INSERT INTO "edu"."rights_function" VALUES ('student_batch_import', '学生批量导入');
INSERT INTO "edu"."rights_function" VALUES ('student_change_manage', '学生转专业管理');
INSERT INTO "edu"."rights_function" VALUES ('student_class_manage', '学生层次代码维护');
INSERT INTO "edu"."rights_function" VALUES ('student_derate_request', '学费减免申请');
INSERT INTO "edu"."rights_function" VALUES ('student_register', '学生注册');
INSERT INTO "edu"."rights_function" VALUES ('student_status_type_manage', '学生状态类型维护');
INSERT INTO "edu"."rights_function" VALUES ('student_type_manage', '学生类型代码维护');
INSERT INTO "edu"."rights_function" VALUES ('user_manage', '用户管理');
INSERT INTO "edu"."rights_function" VALUES ('user_type_manage', '用户类型维护');

-- ----------------------------
-- Table structure for "edu"."rights_override"
-- ----------------------------
DROP TABLE "edu"."rights_override";
CREATE TABLE "edu"."rights_override" (
"user_id" numeric(5) NOT NULL,
"rights_category_id" varchar(255) NOT NULL,
"rights_function_id" varchar(255) NOT NULL,
"override" bool NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON COLUMN "edu"."rights_override"."override" IS 'false 减掉权限（default里有的）， true 加上权限（default里没有的）';

-- ----------------------------
-- Records of rights_override
-- ----------------------------
INSERT INTO "edu"."rights_override" VALUES ('1', 'financial_manage', 'agent_bank_account_manage', 't');
INSERT INTO "edu"."rights_override" VALUES ('1', 'financial_manage', 'charge_type_manage', 't');
INSERT INTO "edu"."rights_override" VALUES ('1', 'financial_manage', 'college_return_manage', 't');
INSERT INTO "edu"."rights_override" VALUES ('1', 'financial_manage', 'entrance_cost_manage', 't');
INSERT INTO "edu"."rights_override" VALUES ('1', 'student_manage', 'agent_return_query', 't');
INSERT INTO "edu"."rights_override" VALUES ('1', 'student_manage', 'student_batch_import', 't');
INSERT INTO "edu"."rights_override" VALUES ('1', 'student_manage', 'student_change_manage', 't');
INSERT INTO "edu"."rights_override" VALUES ('1', 'student_manage', 'student_derate_request', 't');
INSERT INTO "edu"."rights_override" VALUES ('1', 'student_manage', 'student_register', 't');
INSERT INTO "edu"."rights_override" VALUES ('2', 'financial_manage', 'entrance_cost_manage', 't');
INSERT INTO "edu"."rights_override" VALUES ('2', 'system_manage', 'agent_type_manage', 'f');
INSERT INTO "edu"."rights_override" VALUES ('2', 'system_manage', 'batch_manage', 'f');

-- ----------------------------
-- Table structure for "edu"."sd_ethnic_group"
-- ----------------------------
DROP TABLE "edu"."sd_ethnic_group";
CREATE TABLE "edu"."sd_ethnic_group" (
"ethnic_group_id" numeric(5) NOT NULL,
"ethnic_group_name" varchar(255)
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."sd_ethnic_group" IS '民族';
COMMENT ON COLUMN "edu"."sd_ethnic_group"."ethnic_group_id" IS '名族ID';
COMMENT ON COLUMN "edu"."sd_ethnic_group"."ethnic_group_name" IS '民族名称';

-- ----------------------------
-- Records of sd_ethnic_group
-- ----------------------------
INSERT INTO "edu"."sd_ethnic_group" VALUES ('1', '汉族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('2', '蒙古族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('3', '回族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('4', '藏族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('5', '维吾尔族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('6', '苗族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('7', '彝族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('8', '壮族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('9', '布依族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('10', '朝鲜族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('11', '满族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('12', '侗族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('13', '瑶族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('14', '白族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('15', '土家族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('16', '哈尼族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('17', '哈萨克族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('18', '傣族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('19', '黎族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('20', '傈僳族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('21', '佤族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('22', '畲族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('23', '高山族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('24', '拉祜族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('25', '水族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('26', '东乡族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('27', '纳西族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('28', '景颇族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('29', '柯尔克孜族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('30', '土族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('31', '达斡尔族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('32', '仫佬族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('33', '羌族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('34', '布朗族');
INSERT INTO "edu"."sd_ethnic_group" VALUES ('57', '其他民族');

-- ----------------------------
-- Table structure for "edu"."sd_political_status"
-- ----------------------------
DROP TABLE "edu"."sd_political_status";
CREATE TABLE "edu"."sd_political_status" (
"pol_id" numeric(5) NOT NULL,
"pol_name" varchar(255)
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."sd_political_status" IS '政治面貌';
COMMENT ON COLUMN "edu"."sd_political_status"."pol_id" IS '政治面貌id';
COMMENT ON COLUMN "edu"."sd_political_status"."pol_name" IS '政治面貌';

-- ----------------------------
-- Records of sd_political_status
-- ----------------------------
INSERT INTO "edu"."sd_political_status" VALUES ('1', '中共党员');
INSERT INTO "edu"."sd_political_status" VALUES ('2', '中共预备党员');
INSERT INTO "edu"."sd_political_status" VALUES ('3', '共青团员');
INSERT INTO "edu"."sd_political_status" VALUES ('4', '民革会员');
INSERT INTO "edu"."sd_political_status" VALUES ('5', '民盟盟员');
INSERT INTO "edu"."sd_political_status" VALUES ('6', '民建会员');
INSERT INTO "edu"."sd_political_status" VALUES ('7', '民进会员');
INSERT INTO "edu"."sd_political_status" VALUES ('8', '农工党党员');
INSERT INTO "edu"."sd_political_status" VALUES ('9', '致公党党员');
INSERT INTO "edu"."sd_political_status" VALUES ('10', '九三学社社员');
INSERT INTO "edu"."sd_political_status" VALUES ('11', '台盟盟员');
INSERT INTO "edu"."sd_political_status" VALUES ('12', '无党派民主人士');
INSERT INTO "edu"."sd_political_status" VALUES ('13', '群众');

-- ----------------------------
-- Table structure for "edu"."sd_school"
-- ----------------------------
DROP TABLE "edu"."sd_school";
CREATE TABLE "edu"."sd_school" (
"school_code" varchar(255) NOT NULL,
"school_name" varchar(255)
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."sd_school" IS '静态数据--全国所有高校代码表';
COMMENT ON COLUMN "edu"."sd_school"."school_code" IS '教育部高校代码';
COMMENT ON COLUMN "edu"."sd_school"."school_name" IS '教育部高校名称';

-- ----------------------------
-- Records of sd_school
-- ----------------------------
INSERT INTO "edu"."sd_school" VALUES ('00000', '其他');
INSERT INTO "edu"."sd_school" VALUES ('10001', '北京大学');
INSERT INTO "edu"."sd_school" VALUES ('10002', '中国人民大学');
INSERT INTO "edu"."sd_school" VALUES ('10003', '清华大学');
INSERT INTO "edu"."sd_school" VALUES ('10004', '北京交通大学');
INSERT INTO "edu"."sd_school" VALUES ('10005', '北京工业大学');
INSERT INTO "edu"."sd_school" VALUES ('10006', '北京航空航天大学');
INSERT INTO "edu"."sd_school" VALUES ('10007', '北京理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10008', '北京科技大学');
INSERT INTO "edu"."sd_school" VALUES ('10009', '北方工业大学');
INSERT INTO "edu"."sd_school" VALUES ('10010', '北京化工大学');
INSERT INTO "edu"."sd_school" VALUES ('10011', '北京工商大学');
INSERT INTO "edu"."sd_school" VALUES ('10012', '北京服装学院');
INSERT INTO "edu"."sd_school" VALUES ('10013', '北京邮电大学');
INSERT INTO "edu"."sd_school" VALUES ('10015', '北京印刷学院');
INSERT INTO "edu"."sd_school" VALUES ('10016', '北京建筑工程学院');
INSERT INTO "edu"."sd_school" VALUES ('10019', '中国农业大学');
INSERT INTO "edu"."sd_school" VALUES ('10020', '北京农学院');
INSERT INTO "edu"."sd_school" VALUES ('10022', '北京林业大学');
INSERT INTO "edu"."sd_school" VALUES ('10023', '中国协和医科大学');
INSERT INTO "edu"."sd_school" VALUES ('10025', '首都医科大学');
INSERT INTO "edu"."sd_school" VALUES ('10026', '北京中医药大学');
INSERT INTO "edu"."sd_school" VALUES ('10027', '北京师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10028', '首都师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10029', '首都体育学院');
INSERT INTO "edu"."sd_school" VALUES ('10030', '北京外国语大学');
INSERT INTO "edu"."sd_school" VALUES ('10031', '北京第二外国语学院');
INSERT INTO "edu"."sd_school" VALUES ('10032', '北京语言大学');
INSERT INTO "edu"."sd_school" VALUES ('10033', '北京广播学院');
INSERT INTO "edu"."sd_school" VALUES ('10034', '中央财经大学');
INSERT INTO "edu"."sd_school" VALUES ('10036', '对外经济贸易大学');
INSERT INTO "edu"."sd_school" VALUES ('10037', '北京物资学院');
INSERT INTO "edu"."sd_school" VALUES ('10040', '外交学院');
INSERT INTO "edu"."sd_school" VALUES ('10041', '中国人民公安大学');
INSERT INTO "edu"."sd_school" VALUES ('10042', '国际关系学院');
INSERT INTO "edu"."sd_school" VALUES ('10043', '北京体育大学');
INSERT INTO "edu"."sd_school" VALUES ('10045', '中央音乐学院');
INSERT INTO "edu"."sd_school" VALUES ('10046', '中国音乐学院');
INSERT INTO "edu"."sd_school" VALUES ('10047', '中央美术学院');
INSERT INTO "edu"."sd_school" VALUES ('10048', '中央戏剧学院');
INSERT INTO "edu"."sd_school" VALUES ('10049', '中国戏曲学院');
INSERT INTO "edu"."sd_school" VALUES ('10050', '北京电影学院');
INSERT INTO "edu"."sd_school" VALUES ('10051', '北京舞蹈学院');
INSERT INTO "edu"."sd_school" VALUES ('10052', '中央民族大学');
INSERT INTO "edu"."sd_school" VALUES ('10053', '中国政法大学');
INSERT INTO "edu"."sd_school" VALUES ('10055', '南开大学');
INSERT INTO "edu"."sd_school" VALUES ('10056', '天津大学');
INSERT INTO "edu"."sd_school" VALUES ('10057', '天津科技大学');
INSERT INTO "edu"."sd_school" VALUES ('10058', '天津工业大学');
INSERT INTO "edu"."sd_school" VALUES ('10059', '中国民用航空学院');
INSERT INTO "edu"."sd_school" VALUES ('10060', '天津理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10063', '天津中医学院');
INSERT INTO "edu"."sd_school" VALUES ('10065', '天津师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10066', '天津工程师范学院');
INSERT INTO "edu"."sd_school" VALUES ('10068', '天津外国语学院');
INSERT INTO "edu"."sd_school" VALUES ('10069', '天津商学院');
INSERT INTO "edu"."sd_school" VALUES ('10070', '天津财经大学');
INSERT INTO "edu"."sd_school" VALUES ('10071', '天津体育学院');
INSERT INTO "edu"."sd_school" VALUES ('10072', '天津音乐学院');
INSERT INTO "edu"."sd_school" VALUES ('10073', '天津美术学院');
INSERT INTO "edu"."sd_school" VALUES ('10075', '河北大学');
INSERT INTO "edu"."sd_school" VALUES ('10076', '河北工程学院');
INSERT INTO "edu"."sd_school" VALUES ('10077', '石家庄经济学院');
INSERT INTO "edu"."sd_school" VALUES ('10078', '华北水利水电学院');
INSERT INTO "edu"."sd_school" VALUES ('10079', '华北电力大学');
INSERT INTO "edu"."sd_school" VALUES ('10080', '河北工业大学');
INSERT INTO "edu"."sd_school" VALUES ('10081', '河北理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10082', '河北科技大学');
INSERT INTO "edu"."sd_school" VALUES ('10090', '华北煤炭医学院');
INSERT INTO "edu"."sd_school" VALUES ('10093', '承德医学院');
INSERT INTO "edu"."sd_school" VALUES ('10094', '河北师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10107', '石家庄铁道学院');
INSERT INTO "edu"."sd_school" VALUES ('10108', '山西大学');
INSERT INTO "edu"."sd_school" VALUES ('10109', '太原科技大学');
INSERT INTO "edu"."sd_school" VALUES ('10110', '中北大学');
INSERT INTO "edu"."sd_school" VALUES ('10112', '太原理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10113', '山西农业大学');
INSERT INTO "edu"."sd_school" VALUES ('10114', '山西医科大学');
INSERT INTO "edu"."sd_school" VALUES ('10118', '山西师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10125', '山西财经大学');
INSERT INTO "edu"."sd_school" VALUES ('10126', '内蒙古大学');
INSERT INTO "edu"."sd_school" VALUES ('10128', '内蒙古工业大学');
INSERT INTO "edu"."sd_school" VALUES ('10129', '内蒙古农业大学');
INSERT INTO "edu"."sd_school" VALUES ('10132', '内蒙古医学院');
INSERT INTO "edu"."sd_school" VALUES ('10135', '内蒙古师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10136', '内蒙古民族大学');
INSERT INTO "edu"."sd_school" VALUES ('10140', '辽宁大学');
INSERT INTO "edu"."sd_school" VALUES ('10141', '大连理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10142', '沈阳工业大学');
INSERT INTO "edu"."sd_school" VALUES ('10143', '沈阳航空工业学院');
INSERT INTO "edu"."sd_school" VALUES ('10144', '沈阳理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10145', '东北大学');
INSERT INTO "edu"."sd_school" VALUES ('10146', '鞍山科技大学');
INSERT INTO "edu"."sd_school" VALUES ('10147', '辽宁工程技术大学');
INSERT INTO "edu"."sd_school" VALUES ('10148', '辽宁石油化工大学');
INSERT INTO "edu"."sd_school" VALUES ('10149', '沈阳化工学院');
INSERT INTO "edu"."sd_school" VALUES ('10150', '大连交通大学');
INSERT INTO "edu"."sd_school" VALUES ('10151', '大连海事大学');
INSERT INTO "edu"."sd_school" VALUES ('10152', '大连轻工业学院');
INSERT INTO "edu"."sd_school" VALUES ('10153', '沈阳建筑大学');
INSERT INTO "edu"."sd_school" VALUES ('10154', '辽宁工学院');
INSERT INTO "edu"."sd_school" VALUES ('10157', '沈阳农业大学');
INSERT INTO "edu"."sd_school" VALUES ('10158', '大连水产学院');
INSERT INTO "edu"."sd_school" VALUES ('10159', '中国医科大学');
INSERT INTO "edu"."sd_school" VALUES ('10160', '锦州医学院');
INSERT INTO "edu"."sd_school" VALUES ('10161', '大连医科大学');
INSERT INTO "edu"."sd_school" VALUES ('10162', '辽宁中医学院');
INSERT INTO "edu"."sd_school" VALUES ('10163', '沈阳药科大学');
INSERT INTO "edu"."sd_school" VALUES ('10165', '辽宁师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10166', '沈阳师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10167', '渤海大学');
INSERT INTO "edu"."sd_school" VALUES ('10172', '大连外国语学院');
INSERT INTO "edu"."sd_school" VALUES ('10173', '东北财经大学');
INSERT INTO "edu"."sd_school" VALUES ('10175', '中国刑事警察学院');
INSERT INTO "edu"."sd_school" VALUES ('10176', '沈阳体育学院');
INSERT INTO "edu"."sd_school" VALUES ('10177', '沈阳音乐学院');
INSERT INTO "edu"."sd_school" VALUES ('10178', '鲁迅美术学院');
INSERT INTO "edu"."sd_school" VALUES ('10183', '吉林大学');
INSERT INTO "edu"."sd_school" VALUES ('10184', '延边大学');
INSERT INTO "edu"."sd_school" VALUES ('10186', '长春理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10188', '东北电力学院');
INSERT INTO "edu"."sd_school" VALUES ('10190', '长春工业大学');
INSERT INTO "edu"."sd_school" VALUES ('10191', '吉林建筑工程学院');
INSERT INTO "edu"."sd_school" VALUES ('10193', '吉林农业大学');
INSERT INTO "edu"."sd_school" VALUES ('10199', '长春中医学院');
INSERT INTO "edu"."sd_school" VALUES ('10200', '东北师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10203', '吉林师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10207', '长春税务学院');
INSERT INTO "edu"."sd_school" VALUES ('10209', '吉林艺术学院');
INSERT INTO "edu"."sd_school" VALUES ('10212', '黑龙江大学');
INSERT INTO "edu"."sd_school" VALUES ('10213', '哈尔滨工业大学');
INSERT INTO "edu"."sd_school" VALUES ('10216', '燕山大学');
INSERT INTO "edu"."sd_school" VALUES ('10217', '哈尔滨工程大学');
INSERT INTO "edu"."sd_school" VALUES ('10219', '黑龙江科技学院');
INSERT INTO "edu"."sd_school" VALUES ('10220', '大庆石油学院');
INSERT INTO "edu"."sd_school" VALUES ('10221', '齐齐哈尔大学');
INSERT INTO "edu"."sd_school" VALUES ('10222', '佳木斯大学');
INSERT INTO "edu"."sd_school" VALUES ('10223', '黑龙江八一农垦大学');
INSERT INTO "edu"."sd_school" VALUES ('10224', '东北农业大学');
INSERT INTO "edu"."sd_school" VALUES ('10225', '东北林业大学');
INSERT INTO "edu"."sd_school" VALUES ('10226', '哈尔滨医科大学');
INSERT INTO "edu"."sd_school" VALUES ('10228', '黑龙江中医药大学');
INSERT INTO "edu"."sd_school" VALUES ('10231', '哈尔滨师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10240', '哈尔滨商业大学');
INSERT INTO "edu"."sd_school" VALUES ('10246', '复旦大学');
INSERT INTO "edu"."sd_school" VALUES ('10247', '同济大学');
INSERT INTO "edu"."sd_school" VALUES ('10248', '上海交通大学');
INSERT INTO "edu"."sd_school" VALUES ('10251', '华东理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10252', '上海理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10254', '上海海事大学');
INSERT INTO "edu"."sd_school" VALUES ('10255', '东华大学');
INSERT INTO "edu"."sd_school" VALUES ('10264', '上海水产大学');
INSERT INTO "edu"."sd_school" VALUES ('10266', '上海第二医科大学');
INSERT INTO "edu"."sd_school" VALUES ('10268', '上海中医药大学');
INSERT INTO "edu"."sd_school" VALUES ('10269', '华东师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10270', '上海师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10271', '上海外国语大学');
INSERT INTO "edu"."sd_school" VALUES ('10272', '上海财经大学');
INSERT INTO "edu"."sd_school" VALUES ('10273', '上海对外贸易学院');
INSERT INTO "edu"."sd_school" VALUES ('10276', '华东政法学院');
INSERT INTO "edu"."sd_school" VALUES ('10277', '上海体育学院');
INSERT INTO "edu"."sd_school" VALUES ('10278', '上海音乐学院');
INSERT INTO "edu"."sd_school" VALUES ('10279', '上海戏剧学院');
INSERT INTO "edu"."sd_school" VALUES ('10284', '南京大学');
INSERT INTO "edu"."sd_school" VALUES ('10285', '苏州大学');
INSERT INTO "edu"."sd_school" VALUES ('10286', '东南大学');
INSERT INTO "edu"."sd_school" VALUES ('10287', '南京航空航天大学');
INSERT INTO "edu"."sd_school" VALUES ('10288', '南京理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10289', '江苏科技大学');
INSERT INTO "edu"."sd_school" VALUES ('10290', '中国矿业大学');
INSERT INTO "edu"."sd_school" VALUES ('10291', '南京工业大学');
INSERT INTO "edu"."sd_school" VALUES ('10292', '江苏工业学院');
INSERT INTO "edu"."sd_school" VALUES ('10293', '南京邮电学院');
INSERT INTO "edu"."sd_school" VALUES ('10294', '河海大学');
INSERT INTO "edu"."sd_school" VALUES ('10295', '江南大学');
INSERT INTO "edu"."sd_school" VALUES ('10298', '南京林业大学');
INSERT INTO "edu"."sd_school" VALUES ('10299', '江苏大学');
INSERT INTO "edu"."sd_school" VALUES ('10300', '南京信息工程大学');
INSERT INTO "edu"."sd_school" VALUES ('10307', '南京农业大学');
INSERT INTO "edu"."sd_school" VALUES ('10311', '南通大学');
INSERT INTO "edu"."sd_school" VALUES ('10312', '南京医科大学');
INSERT INTO "edu"."sd_school" VALUES ('10313', '徐州医学院');
INSERT INTO "edu"."sd_school" VALUES ('10315', '南京中医药大学');
INSERT INTO "edu"."sd_school" VALUES ('10316', '中国药科大学');
INSERT INTO "edu"."sd_school" VALUES ('10319', '南京师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10320', '徐州师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10327', '南京财经大学');
INSERT INTO "edu"."sd_school" VALUES ('10330', '南京体育学院');
INSERT INTO "edu"."sd_school" VALUES ('10331', '南京艺术学院');
INSERT INTO "edu"."sd_school" VALUES ('10332', '苏州科技学院');
INSERT INTO "edu"."sd_school" VALUES ('10335', '浙江大学');
INSERT INTO "edu"."sd_school" VALUES ('10336', '杭州电子科技大学');
INSERT INTO "edu"."sd_school" VALUES ('10337', '浙江工业大学');
INSERT INTO "edu"."sd_school" VALUES ('10338', '浙江理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10341', '浙江林学院');
INSERT INTO "edu"."sd_school" VALUES ('10343', '温州医学院');
INSERT INTO "edu"."sd_school" VALUES ('10344', '浙江中医学院');
INSERT INTO "edu"."sd_school" VALUES ('10345', '浙江师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10346', '杭州师范学院');
INSERT INTO "edu"."sd_school" VALUES ('10351', '温州师范学院');
INSERT INTO "edu"."sd_school" VALUES ('10353', '浙江工商大学');
INSERT INTO "edu"."sd_school" VALUES ('10355', '中国美术学院');
INSERT INTO "edu"."sd_school" VALUES ('10356', '中国计量学院');
INSERT INTO "edu"."sd_school" VALUES ('10357', '安徽大学');
INSERT INTO "edu"."sd_school" VALUES ('10358', '中国科学技术大学');
INSERT INTO "edu"."sd_school" VALUES ('10359', '合肥工业大学');
INSERT INTO "edu"."sd_school" VALUES ('10360', '安徽工业大学');
INSERT INTO "edu"."sd_school" VALUES ('10361', '安徽理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10363', '安徽工程科技学院');
INSERT INTO "edu"."sd_school" VALUES ('10364', '安徽农业大学');
INSERT INTO "edu"."sd_school" VALUES ('10366', '安徽医科大学');
INSERT INTO "edu"."sd_school" VALUES ('10367', '蚌埠医学院');
INSERT INTO "edu"."sd_school" VALUES ('10368', '皖南医学院');
INSERT INTO "edu"."sd_school" VALUES ('10369', '安徽中医学院');
INSERT INTO "edu"."sd_school" VALUES ('10370', '安徽师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10373', '淮北煤炭师范学院');
INSERT INTO "edu"."sd_school" VALUES ('10378', '安徽财经大学');
INSERT INTO "edu"."sd_school" VALUES ('10384', '厦门大学');
INSERT INTO "edu"."sd_school" VALUES ('10385', '华侨大学');
INSERT INTO "edu"."sd_school" VALUES ('10386', '福州大学');
INSERT INTO "edu"."sd_school" VALUES ('10389', '福建农林大学');
INSERT INTO "edu"."sd_school" VALUES ('10392', '福建医科大学');
INSERT INTO "edu"."sd_school" VALUES ('10393', '福建中医学院');
INSERT INTO "edu"."sd_school" VALUES ('10394', '福建师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10402', '漳州师范学院');
INSERT INTO "edu"."sd_school" VALUES ('10404', '华东交通大学');
INSERT INTO "edu"."sd_school" VALUES ('10405', '东华理工学院');
INSERT INTO "edu"."sd_school" VALUES ('10406', '南昌航空工业学院');
INSERT INTO "edu"."sd_school" VALUES ('10407', '江西理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10408', '景德镇陶瓷学院');
INSERT INTO "edu"."sd_school" VALUES ('10410', '江西农业大学');
INSERT INTO "edu"."sd_school" VALUES ('10411', '江西医学院');
INSERT INTO "edu"."sd_school" VALUES ('10412', '江西中医学院');
INSERT INTO "edu"."sd_school" VALUES ('10414', '江西师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10418', '赣南师范学院');
INSERT INTO "edu"."sd_school" VALUES ('10421', '江西财经大学');
INSERT INTO "edu"."sd_school" VALUES ('10422', '山东大学');
INSERT INTO "edu"."sd_school" VALUES ('10423', '中国海洋大学');
INSERT INTO "edu"."sd_school" VALUES ('10424', '山东科技大学');
INSERT INTO "edu"."sd_school" VALUES ('10425', '石油大学（华东）');
INSERT INTO "edu"."sd_school" VALUES ('10426', '青岛科技大学');
INSERT INTO "edu"."sd_school" VALUES ('10429', '青岛理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10430', '山东建筑工程学院');
INSERT INTO "edu"."sd_school" VALUES ('10431', '山东轻工业学院');
INSERT INTO "edu"."sd_school" VALUES ('10434', '山东农业大学');
INSERT INTO "edu"."sd_school" VALUES ('10435', '莱阳农学院');
INSERT INTO "edu"."sd_school" VALUES ('10438', '潍坊医学院');
INSERT INTO "edu"."sd_school" VALUES ('10439', '泰山医学院');
INSERT INTO "edu"."sd_school" VALUES ('10440', '滨州医学院');
INSERT INTO "edu"."sd_school" VALUES ('10441', '山东中医药大学');
INSERT INTO "edu"."sd_school" VALUES ('10445', '山东师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10446', '曲阜师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10447', '聊城大学');
INSERT INTO "edu"."sd_school" VALUES ('10451', '烟台师范学院');
INSERT INTO "edu"."sd_school" VALUES ('10456', '山东经济学院');
INSERT INTO "edu"."sd_school" VALUES ('10457', '山东体育学院');
INSERT INTO "edu"."sd_school" VALUES ('10458', '山东艺术学院');
INSERT INTO "edu"."sd_school" VALUES ('10459', '郑州大学');
INSERT INTO "edu"."sd_school" VALUES ('10460', '河南理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10462', '郑州轻工业学院');
INSERT INTO "edu"."sd_school" VALUES ('10463', '河南工业大学');
INSERT INTO "edu"."sd_school" VALUES ('10464', '河南科技大学');
INSERT INTO "edu"."sd_school" VALUES ('10465', '中原工学院');
INSERT INTO "edu"."sd_school" VALUES ('10466', '河南农业大学');
INSERT INTO "edu"."sd_school" VALUES ('10471', '河南中医学院');
INSERT INTO "edu"."sd_school" VALUES ('10472', '新乡医学院');
INSERT INTO "edu"."sd_school" VALUES ('10475', '河南大学');
INSERT INTO "edu"."sd_school" VALUES ('10476', '河南师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10477', '信阳师范学院');
INSERT INTO "edu"."sd_school" VALUES ('10484', '河南财经学院');
INSERT INTO "edu"."sd_school" VALUES ('10486', '武汉大学');
INSERT INTO "edu"."sd_school" VALUES ('10487', '华中科技大学');
INSERT INTO "edu"."sd_school" VALUES ('10488', '武汉科技大学');
INSERT INTO "edu"."sd_school" VALUES ('10489', '长江大学');
INSERT INTO "edu"."sd_school" VALUES ('10490', '武汉化工学院');
INSERT INTO "edu"."sd_school" VALUES ('10491', '中国地质大学（武汉）');
INSERT INTO "edu"."sd_school" VALUES ('10495', '武汉科技学院');
INSERT INTO "edu"."sd_school" VALUES ('10496', '武汉工业学院');
INSERT INTO "edu"."sd_school" VALUES ('10497', '武汉理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10500', '湖北工大学');
INSERT INTO "edu"."sd_school" VALUES ('10504', '华中农业大学');
INSERT INTO "edu"."sd_school" VALUES ('10507', '湖北中医学院');
INSERT INTO "edu"."sd_school" VALUES ('10511', '华中师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10512', '湖北大学');
INSERT INTO "edu"."sd_school" VALUES ('10520', '中南财经政法大学');
INSERT INTO "edu"."sd_school" VALUES ('10522', '武汉体育学院');
INSERT INTO "edu"."sd_school" VALUES ('10523', '湖北美术学院');
INSERT INTO "edu"."sd_school" VALUES ('10524', '中南民族大学');
INSERT INTO "edu"."sd_school" VALUES ('10530', '湘潭大学');
INSERT INTO "edu"."sd_school" VALUES ('10531', '吉首大学');
INSERT INTO "edu"."sd_school" VALUES ('10532', '湖南大学');
INSERT INTO "edu"."sd_school" VALUES ('10533', '中南大学');
INSERT INTO "edu"."sd_school" VALUES ('10536', '长沙理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10537', '湖南农业大学');
INSERT INTO "edu"."sd_school" VALUES ('10538', '中南林学院');
INSERT INTO "edu"."sd_school" VALUES ('10540', '南华大学');
INSERT INTO "edu"."sd_school" VALUES ('10541', '湖南中医学院');
INSERT INTO "edu"."sd_school" VALUES ('10542', '湖南师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10557', '湖南科技大学');
INSERT INTO "edu"."sd_school" VALUES ('10558', '中山大学');
INSERT INTO "edu"."sd_school" VALUES ('10559', '暨南大学');
INSERT INTO "edu"."sd_school" VALUES ('10560', '汕头大学');
INSERT INTO "edu"."sd_school" VALUES ('10561', '华南理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10564', '华南农业大学');
INSERT INTO "edu"."sd_school" VALUES ('10565', '华南热带农业大学');
INSERT INTO "edu"."sd_school" VALUES ('10566', '湛江海洋大学');
INSERT INTO "edu"."sd_school" VALUES ('10570', '广州医学院');
INSERT INTO "edu"."sd_school" VALUES ('10571', '广东医学院');
INSERT INTO "edu"."sd_school" VALUES ('10572', '广州中医药大学');
INSERT INTO "edu"."sd_school" VALUES ('10573', '广东药学院');
INSERT INTO "edu"."sd_school" VALUES ('10574', '华南师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10575', '广州大学');
INSERT INTO "edu"."sd_school" VALUES ('10585', '广州体育学院');
INSERT INTO "edu"."sd_school" VALUES ('10586', '广州美术学院');
INSERT INTO "edu"."sd_school" VALUES ('10587', '星海音乐学院');
INSERT INTO "edu"."sd_school" VALUES ('10589', '海南大学');
INSERT INTO "edu"."sd_school" VALUES ('10590', '深圳大学');
INSERT INTO "edu"."sd_school" VALUES ('10592', '广东商学院');
INSERT INTO "edu"."sd_school" VALUES ('10593', '广西大学');
INSERT INTO "edu"."sd_school" VALUES ('10595', '桂林电子工业学院');
INSERT INTO "edu"."sd_school" VALUES ('10596', '桂林工学院');
INSERT INTO "edu"."sd_school" VALUES ('10598', '广西医科大学');
INSERT INTO "edu"."sd_school" VALUES ('10600', '广西中医学院');
INSERT INTO "edu"."sd_school" VALUES ('10602', '广西师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10603', '广西师范学院');
INSERT INTO "edu"."sd_school" VALUES ('10607', '广西艺术学院');
INSERT INTO "edu"."sd_school" VALUES ('10608', '广西民族学院');
INSERT INTO "edu"."sd_school" VALUES ('10610', '四川大学');
INSERT INTO "edu"."sd_school" VALUES ('10611', '重庆大学');
INSERT INTO "edu"."sd_school" VALUES ('10613', '西南交通大学');
INSERT INTO "edu"."sd_school" VALUES ('10614', '电子科技大学');
INSERT INTO "edu"."sd_school" VALUES ('10615', '西南石油学院');
INSERT INTO "edu"."sd_school" VALUES ('10616', '成都理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10617', '重庆邮电学院');
INSERT INTO "edu"."sd_school" VALUES ('10618', '重庆交通学院');
INSERT INTO "edu"."sd_school" VALUES ('10619', '西南科技大学');
INSERT INTO "edu"."sd_school" VALUES ('10621', '成都信息工程学院');
INSERT INTO "edu"."sd_school" VALUES ('10622', '四川理工学院');
INSERT INTO "edu"."sd_school" VALUES ('10623', '西华大学');
INSERT INTO "edu"."sd_school" VALUES ('10625', '西南农业大学');
INSERT INTO "edu"."sd_school" VALUES ('10626', '四川农业大学');
INSERT INTO "edu"."sd_school" VALUES ('10631', '重庆医科大学');
INSERT INTO "edu"."sd_school" VALUES ('10632', '泸州医学院');
INSERT INTO "edu"."sd_school" VALUES ('10633', '成都中医药大学');
INSERT INTO "edu"."sd_school" VALUES ('10635', '西南师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10636', '四川师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10637', '重庆师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10638', '西华师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10650', '四川外语学院');
INSERT INTO "edu"."sd_school" VALUES ('10651', '西南财经大学');
INSERT INTO "edu"."sd_school" VALUES ('10652', '西南政法大学');
INSERT INTO "edu"."sd_school" VALUES ('10653', '成都体育学院');
INSERT INTO "edu"."sd_school" VALUES ('10654', '四川音乐学院');
INSERT INTO "edu"."sd_school" VALUES ('10655', '四川美术学院');
INSERT INTO "edu"."sd_school" VALUES ('10656', '西南民族大学');
INSERT INTO "edu"."sd_school" VALUES ('10657', '贵州大学');
INSERT INTO "edu"."sd_school" VALUES ('10658', '贵州工业大学');
INSERT INTO "edu"."sd_school" VALUES ('10660', '贵阳医学院');
INSERT INTO "edu"."sd_school" VALUES ('10661', '遵义医学院');
INSERT INTO "edu"."sd_school" VALUES ('10662', '贵阳中医学院');
INSERT INTO "edu"."sd_school" VALUES ('10663', '贵州师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10671', '贵州财经学院');
INSERT INTO "edu"."sd_school" VALUES ('10673', '云南大学');
INSERT INTO "edu"."sd_school" VALUES ('10674', '昆明理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10676', '云南农业大学');
INSERT INTO "edu"."sd_school" VALUES ('10677', '西南林学院');
INSERT INTO "edu"."sd_school" VALUES ('10678', '昆明医学院');
INSERT INTO "edu"."sd_school" VALUES ('10679', '大理学院');
INSERT INTO "edu"."sd_school" VALUES ('10680', '云南中医学院');
INSERT INTO "edu"."sd_school" VALUES ('10681', '云南师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10689', '云南财贸学院');
INSERT INTO "edu"."sd_school" VALUES ('10690', '云南艺术学院');
INSERT INTO "edu"."sd_school" VALUES ('10691', '云南民族大学');
INSERT INTO "edu"."sd_school" VALUES ('10694', '西藏大学');
INSERT INTO "edu"."sd_school" VALUES ('10695', '西藏民族学院');
INSERT INTO "edu"."sd_school" VALUES ('10696', '西藏藏医学院');
INSERT INTO "edu"."sd_school" VALUES ('10697', '西北大学');
INSERT INTO "edu"."sd_school" VALUES ('10698', '西安交通大学');
INSERT INTO "edu"."sd_school" VALUES ('10699', '西北工业大学');
INSERT INTO "edu"."sd_school" VALUES ('10700', '西安理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10701', '西安电子科技大学');
INSERT INTO "edu"."sd_school" VALUES ('10702', '西安工业学院');
INSERT INTO "edu"."sd_school" VALUES ('10703', '西安建筑科技大学');
INSERT INTO "edu"."sd_school" VALUES ('10704', '西安科技大学');
INSERT INTO "edu"."sd_school" VALUES ('10705', '西安石油大学');
INSERT INTO "edu"."sd_school" VALUES ('10708', '陕西科技大学');
INSERT INTO "edu"."sd_school" VALUES ('10709', '西安工程科技学院');
INSERT INTO "edu"."sd_school" VALUES ('10712', '西北农林科技大学');
INSERT INTO "edu"."sd_school" VALUES ('10716', '陕西中医学院');
INSERT INTO "edu"."sd_school" VALUES ('10718', '陕西师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10719', '延安大学');
INSERT INTO "edu"."sd_school" VALUES ('10724', '西安外国语学院');
INSERT INTO "edu"."sd_school" VALUES ('10726', '西北政法学院');
INSERT INTO "edu"."sd_school" VALUES ('10727', '西安体育学院');
INSERT INTO "edu"."sd_school" VALUES ('10728', '西安音乐学院');
INSERT INTO "edu"."sd_school" VALUES ('10729', '西安美术学院');
INSERT INTO "edu"."sd_school" VALUES ('10730', '兰州大学');
INSERT INTO "edu"."sd_school" VALUES ('10731', '兰州理工大学');
INSERT INTO "edu"."sd_school" VALUES ('10732', '兰州交通大学');
INSERT INTO "edu"."sd_school" VALUES ('10733', '甘肃农业大学');
INSERT INTO "edu"."sd_school" VALUES ('10734', '兰州医学院');
INSERT INTO "edu"."sd_school" VALUES ('10735', '甘肃中医学院');
INSERT INTO "edu"."sd_school" VALUES ('10736', '西北师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10741', '兰州商学院');
INSERT INTO "edu"."sd_school" VALUES ('10742', '西北民族大学');
INSERT INTO "edu"."sd_school" VALUES ('10743', '青海大学');
INSERT INTO "edu"."sd_school" VALUES ('10745', '青海医学院');
INSERT INTO "edu"."sd_school" VALUES ('10746', '青海师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10748', '青海民族学院');
INSERT INTO "edu"."sd_school" VALUES ('10749', '宁夏大学');
INSERT INTO "edu"."sd_school" VALUES ('10752', '宁夏医学院');
INSERT INTO "edu"."sd_school" VALUES ('10755', '新疆大学');
INSERT INTO "edu"."sd_school" VALUES ('10757', '塔里木农垦大学');
INSERT INTO "edu"."sd_school" VALUES ('10758', '新疆农业大学');
INSERT INTO "edu"."sd_school" VALUES ('10759', '新疆石河子大学');
INSERT INTO "edu"."sd_school" VALUES ('10760', '新疆医科大学');
INSERT INTO "edu"."sd_school" VALUES ('10762', '新疆师范大学');
INSERT INTO "edu"."sd_school" VALUES ('10763', '喀什师范学院');
INSERT INTO "edu"."sd_school" VALUES ('10766', '新疆财经学院');
INSERT INTO "edu"."sd_school" VALUES ('10792', '天津城建学院');
INSERT INTO "edu"."sd_school" VALUES ('11035', '沈阳大学');
INSERT INTO "edu"."sd_school" VALUES ('11066', '烟台大学');
INSERT INTO "edu"."sd_school" VALUES ('11105', '中国人民武装警察部队学院');
INSERT INTO "edu"."sd_school" VALUES ('11117', '扬州大学');
INSERT INTO "edu"."sd_school" VALUES ('11232', '北京机械工业学院');
INSERT INTO "edu"."sd_school" VALUES ('11258', '大连大学');
INSERT INTO "edu"."sd_school" VALUES ('11349', '五邑大学');
INSERT INTO "edu"."sd_school" VALUES ('11407', '西北第二民族学院');
INSERT INTO "edu"."sd_school" VALUES ('11412', '华北电力大学（北京）');
INSERT INTO "edu"."sd_school" VALUES ('11413', '中国矿业大学（北京）');
INSERT INTO "edu"."sd_school" VALUES ('11414', '石油大学（北京）');
INSERT INTO "edu"."sd_school" VALUES ('11415', '中国地质大学（北京）');
INSERT INTO "edu"."sd_school" VALUES ('11482', '浙江财经学院');
INSERT INTO "edu"."sd_school" VALUES ('11524', '武汉音乐学院');
INSERT INTO "edu"."sd_school" VALUES ('11535', '株洲工学院');
INSERT INTO "edu"."sd_school" VALUES ('11625', '中国青年政治学院');
INSERT INTO "edu"."sd_school" VALUES ('11646', '宁波大学');
INSERT INTO "edu"."sd_school" VALUES ('11658', '海南师范学院');
INSERT INTO "edu"."sd_school" VALUES ('11660', '重庆工学院');
INSERT INTO "edu"."sd_school" VALUES ('11664', '西安邮电学院');
INSERT INTO "edu"."sd_school" VALUES ('11799', '重庆工商大学');
INSERT INTO "edu"."sd_school" VALUES ('11822', '山东财政学院');
INSERT INTO "edu"."sd_school" VALUES ('11900', '集美大学');
INSERT INTO "edu"."sd_school" VALUES ('11902', '南昌大学');
INSERT INTO "edu"."sd_school" VALUES ('11903', '上海大学');
INSERT INTO "edu"."sd_school" VALUES ('11904', '天津医科大学');
INSERT INTO "edu"."sd_school" VALUES ('11906', '青岛大学');
INSERT INTO "edu"."sd_school" VALUES ('11910', '广东外语外贸大学');
INSERT INTO "edu"."sd_school" VALUES ('11911', '广东工业大学');
INSERT INTO "edu"."sd_school" VALUES ('11912', '首都经济贸易大学');
INSERT INTO "edu"."sd_school" VALUES ('11914', '哈尔滨理工大学');
INSERT INTO "edu"."sd_school" VALUES ('11918', '河北经贸大学');
INSERT INTO "edu"."sd_school" VALUES ('11919', '河北医科大学');
INSERT INTO "edu"."sd_school" VALUES ('11920', '河北农业大学');
INSERT INTO "edu"."sd_school" VALUES ('11923', '北华大学');
INSERT INTO "edu"."sd_school" VALUES ('11934', '三峡大学');
INSERT INTO "edu"."sd_school" VALUES ('11941', '长安大学');
INSERT INTO "edu"."sd_school" VALUES ('11944', '济南大学');
INSERT INTO "edu"."sd_school" VALUES ('11970', '山东理工大学');
INSERT INTO "edu"."sd_school" VALUES ('11973', '内蒙古科技大学');
INSERT INTO "edu"."sd_school" VALUES ('80000', '中共中央党校');
INSERT INTO "edu"."sd_school" VALUES ('80001', '中国科学院研究生院');
INSERT INTO "edu"."sd_school" VALUES ('80005', '武汉岩土力学研究所');
INSERT INTO "edu"."sd_school" VALUES ('80014', '上海应用物理研究所');
INSERT INTO "edu"."sd_school" VALUES ('80015', '中科院等离子所');
INSERT INTO "edu"."sd_school" VALUES ('80016', '中科院固体物理研究所');
INSERT INTO "edu"."sd_school" VALUES ('80017', '中科院近代物理研究所');
INSERT INTO "edu"."sd_school" VALUES ('80018', '中科院国家天文台南京天文光学技术所');
INSERT INTO "edu"."sd_school" VALUES ('80019', '中科院国家天文台长春人造卫星观测');
INSERT INTO "edu"."sd_school" VALUES ('80020', '武汉物理与数学研究所');
INSERT INTO "edu"."sd_school" VALUES ('80021', '中科院紫金山天文台');
INSERT INTO "edu"."sd_school" VALUES ('80022', '上海天文台');
INSERT INTO "edu"."sd_school" VALUES ('80023', '中科院云南天文台');
INSERT INTO "edu"."sd_school" VALUES ('80024', '国家授时中心');
INSERT INTO "edu"."sd_school" VALUES ('80026', '声学研究所东海研究站');
INSERT INTO "edu"."sd_school" VALUES ('80028', '中科院新疆理化技术研究所');
INSERT INTO "edu"."sd_school" VALUES ('80033', '中科院广州化学研究所');
INSERT INTO "edu"."sd_school" VALUES ('80035', '上海有机化学研究所');
INSERT INTO "edu"."sd_school" VALUES ('80036', '中科院成都有机化学研究所');
INSERT INTO "edu"."sd_school" VALUES ('80037', '中科院长春应用化学研究所');
INSERT INTO "edu"."sd_school" VALUES ('80038', '中科院大连化学物理研究所');
INSERT INTO "edu"."sd_school" VALUES ('80039', '中科院兰州化学物理研究所');
INSERT INTO "edu"."sd_school" VALUES ('80040', '上海硅酸盐研究所');
INSERT INTO "edu"."sd_school" VALUES ('80043', '中科院山西煤炭化学研究所');
INSERT INTO "edu"."sd_school" VALUES ('80045', '中科院福建物质结构研究所');
INSERT INTO "edu"."sd_school" VALUES ('80046', '中科院青海盐湖研究所');
INSERT INTO "edu"."sd_school" VALUES ('80053', '中科院兰州地质研究所');
INSERT INTO "edu"."sd_school" VALUES ('80055', '中科院南京地质古生物研究所');
INSERT INTO "edu"."sd_school" VALUES ('80057', '测量与地球物理研究所');
INSERT INTO "edu"."sd_school" VALUES ('80061', '中科院南京地理与湖泊研究所');
INSERT INTO "edu"."sd_school" VALUES ('80062', '中科院东北地理与农业生态研究所');
INSERT INTO "edu"."sd_school" VALUES ('80063', '中科院成都山地灾害与环境研究所');
INSERT INTO "edu"."sd_school" VALUES ('80065', '中科院地球化学研究所');
INSERT INTO "edu"."sd_school" VALUES ('80068', '中科院海洋研究所');
INSERT INTO "edu"."sd_school" VALUES ('80069', '中科院南海海洋研究所');
INSERT INTO "edu"."sd_school" VALUES ('80076', '中科院寒区旱区环境与工程研究所');
INSERT INTO "edu"."sd_school" VALUES ('80100', '上海生命科学研究院');
INSERT INTO "edu"."sd_school" VALUES ('80102', '中科院新疆生态与地理研究所');
INSERT INTO "edu"."sd_school" VALUES ('80104', '中科院昆明动物研究所');
INSERT INTO "edu"."sd_school" VALUES ('80106', '中科院昆明植物研究所');
INSERT INTO "edu"."sd_school" VALUES ('80107', '中科院华南植物研究所');
INSERT INTO "edu"."sd_school" VALUES ('80108', '武汉植物研究所');
INSERT INTO "edu"."sd_school" VALUES ('80110', '中科院成都生物研究所');
INSERT INTO "edu"."sd_school" VALUES ('80119', '水生生物研究所');
INSERT INTO "edu"."sd_school" VALUES ('80122', '中科院西北高原生物研究所');
INSERT INTO "edu"."sd_school" VALUES ('80123', '上海药物研究所');
INSERT INTO "edu"."sd_school" VALUES ('80124', '武汉病毒研究所');
INSERT INTO "edu"."sd_school" VALUES ('80126', '中科院南京土壤研究所');
INSERT INTO "edu"."sd_school" VALUES ('80127', '中科院沈阳应用生态研究所');
INSERT INTO "edu"."sd_school" VALUES ('80128', '中科院西双版纳热带植物园');
INSERT INTO "edu"."sd_school" VALUES ('80129', '水土保持与生态环境研究中心');
INSERT INTO "edu"."sd_school" VALUES ('80133', '中科院沈阳计算技术研究所');
INSERT INTO "edu"."sd_school" VALUES ('80138', '上海微系统与信息技术研究所');
INSERT INTO "edu"."sd_school" VALUES ('80139', '中科院长春光学精密机械与物理研究所');
INSERT INTO "edu"."sd_school" VALUES ('80140', '上海光学精密机械研究所');
INSERT INTO "edu"."sd_school" VALUES ('80141', '中科院安徽光机所');
INSERT INTO "edu"."sd_school" VALUES ('80142', '西安光学精密机械研究所');
INSERT INTO "edu"."sd_school" VALUES ('80143', '上海技术物理研究所');
INSERT INTO "edu"."sd_school" VALUES ('80144', '中科院金属研究所');
INSERT INTO "edu"."sd_school" VALUES ('80147', '中科院沈阳自动化研究所');
INSERT INTO "edu"."sd_school" VALUES ('80149', '中科院广州能源研究所');
INSERT INTO "edu"."sd_school" VALUES ('80151', '中科院光电技术研究所');
INSERT INTO "edu"."sd_school" VALUES ('80153', '中科院成都计算机应用研究所');
INSERT INTO "edu"."sd_school" VALUES ('80154', '中科院成都情报文献中心');
INSERT INTO "edu"."sd_school" VALUES ('80156', '中科院石家庄农业现代化研究所');
INSERT INTO "edu"."sd_school" VALUES ('80157', '中科院合肥智能机械研究所');
INSERT INTO "edu"."sd_school" VALUES ('80158', '地球环境研究所');
INSERT INTO "edu"."sd_school" VALUES ('80162', '中科院亚热带区域农业研究所');
INSERT INTO "edu"."sd_school" VALUES ('80163', '中科院南京天文仪器研制中心');
INSERT INTO "edu"."sd_school" VALUES ('80165', '中科院广州地球化学研究所');
INSERT INTO "edu"."sd_school" VALUES ('80166', '中科院乌鲁木齐天文站');
INSERT INTO "edu"."sd_school" VALUES ('80168', '中科院合肥物质科学研究院');
INSERT INTO "edu"."sd_school" VALUES ('80201', '中国社会科学院研究生院');
INSERT INTO "edu"."sd_school" VALUES ('80901', '中国科学技术信息研究所');
INSERT INTO "edu"."sd_school" VALUES ('81301', '中国现代国际关系研究院');
INSERT INTO "edu"."sd_school" VALUES ('81601', '财政部财政科学研究所');
INSERT INTO "edu"."sd_school" VALUES ('81801', '中国人民银行金融研究所');
INSERT INTO "edu"."sd_school" VALUES ('82001', '国际贸易经济合作研究院');
INSERT INTO "edu"."sd_school" VALUES ('82101', '中国农业科学院');
INSERT INTO "edu"."sd_school" VALUES ('82110', '中国兽医药品监察所');
INSERT INTO "edu"."sd_school" VALUES ('82201', '中国林业科学研究院');
INSERT INTO "edu"."sd_school" VALUES ('82301', '中国水利水电科学研究院');
INSERT INTO "edu"."sd_school" VALUES ('82302', '中国电力科学研究院');
INSERT INTO "edu"."sd_school" VALUES ('82303', '国电自动化研究院');
INSERT INTO "edu"."sd_school" VALUES ('82304', '国电热工研究院');
INSERT INTO "edu"."sd_school" VALUES ('82305', '长江科学院');
INSERT INTO "edu"."sd_school" VALUES ('82306', '南京水利科学研究院');
INSERT INTO "edu"."sd_school" VALUES ('82401', '中国建筑科学研究院');
INSERT INTO "edu"."sd_school" VALUES ('82402', '中国城市规划设计研究院');
INSERT INTO "edu"."sd_school" VALUES ('82403', '中国建筑设计研究院');
INSERT INTO "edu"."sd_school" VALUES ('82405', '中国环境科学研究院');
INSERT INTO "edu"."sd_school" VALUES ('82501', '中国地质科学院');
INSERT INTO "edu"."sd_school" VALUES ('82503', '地球物理地球化学勘查研究所');
INSERT INTO "edu"."sd_school" VALUES ('82601', '钢铁研究总院');
INSERT INTO "edu"."sd_school" VALUES ('82602', '中冶集团建筑研究总院');
INSERT INTO "edu"."sd_school" VALUES ('82603', '长沙矿冶研究院');
INSERT INTO "edu"."sd_school" VALUES ('82604', '冶金部马鞍山矿山研究院');
INSERT INTO "edu"."sd_school" VALUES ('82605', '冶金自动化研究设计院');
INSERT INTO "edu"."sd_school" VALUES ('82606', '洛阳耐火材料研究所');
INSERT INTO "edu"."sd_school" VALUES ('82607', '中钢集团鞍山热能研究院');
INSERT INTO "edu"."sd_school" VALUES ('82608', '天津地质研究院');
INSERT INTO "edu"."sd_school" VALUES ('82609', '武汉安全环保研究院');
INSERT INTO "edu"."sd_school" VALUES ('82701', '机械科学研究院');
INSERT INTO "edu"."sd_school" VALUES ('82702', '北京机械工业自动化研究所');
INSERT INTO "edu"."sd_school" VALUES ('82703', '北京机电研究所');
INSERT INTO "edu"."sd_school" VALUES ('82705', '沈阳铸造研究所');
INSERT INTO "edu"."sd_school" VALUES ('82706', '机械科学研究院哈尔滨焊接研究所');
INSERT INTO "edu"."sd_school" VALUES ('82707', '上海材料研究所');
INSERT INTO "edu"."sd_school" VALUES ('82708', '郑州机械研究所');
INSERT INTO "edu"."sd_school" VALUES ('82709', '武汉材料保护研究所');
INSERT INTO "edu"."sd_school" VALUES ('82715', '中国农业机械化科学研究院');
INSERT INTO "edu"."sd_school" VALUES ('82717', '上海发电设备成套设计研究所');
INSERT INTO "edu"."sd_school" VALUES ('82718', '上海内燃机研究所');
INSERT INTO "edu"."sd_school" VALUES ('82801', '中国原子能科学研究院');
INSERT INTO "edu"."sd_school" VALUES ('82802', '中国核动力研究设计院');
INSERT INTO "edu"."sd_school" VALUES ('82803', '核工业第二研究设计院');
INSERT INTO "edu"."sd_school" VALUES ('82804', '核工业理化工程研究院');
INSERT INTO "edu"."sd_school" VALUES ('82805', '上海核工程研究设计院');
INSERT INTO "edu"."sd_school" VALUES ('82806', '核工业北京地质研究院');
INSERT INTO "edu"."sd_school" VALUES ('82807', '北京化工冶金研究院');
INSERT INTO "edu"."sd_school" VALUES ('82808', '中国辐射防护研究院');
INSERT INTO "edu"."sd_school" VALUES ('82809', '核工业西南物理研究院');
INSERT INTO "edu"."sd_school" VALUES ('82818', '中国工程物理研究院北京研究生部');
INSERT INTO "edu"."sd_school" VALUES ('82901', '中国航空研究院');
INSERT INTO "edu"."sd_school" VALUES ('82902', '北京航空精密机械研究所');
INSERT INTO "edu"."sd_school" VALUES ('82903', '航空工业总公司601所');
INSERT INTO "edu"."sd_school" VALUES ('82904', '中国航空研究院６０３所');
INSERT INTO "edu"."sd_school" VALUES ('82905', '中航六零六所');
INSERT INTO "edu"."sd_school" VALUES ('82906', '中国航空研究院６１１所');
INSERT INTO "edu"."sd_school" VALUES ('82907', '中国空空导弹研究院');
INSERT INTO "edu"."sd_school" VALUES ('82908', '航空工业总公司613所');
INSERT INTO "edu"."sd_school" VALUES ('82909', '中国航空研究院６２３所');
INSERT INTO "edu"."sd_school" VALUES ('82910', '中国航空研究院６２４所');
INSERT INTO "edu"."sd_school" VALUES ('82911', '中国飞行试验研究院');
INSERT INTO "edu"."sd_school" VALUES ('82912', '中国航空研究院６３１所');
INSERT INTO "edu"."sd_school" VALUES ('82913', '北京航空材料研究院');
INSERT INTO "edu"."sd_school" VALUES ('82914', '中航一集团北京航空制造工程研究所');
INSERT INTO "edu"."sd_school" VALUES ('82920', '中国航空工业规划设计研究院');
INSERT INTO "edu"."sd_school" VALUES ('82925', '中国航空动力机械研究所');
INSERT INTO "edu"."sd_school" VALUES ('82927', '中国航空研究院６０９所');
INSERT INTO "edu"."sd_school" VALUES ('82928', '中国航空工业空气动力研究院');
INSERT INTO "edu"."sd_school" VALUES ('82929', '航空工业总公司626所');
INSERT INTO "edu"."sd_school" VALUES ('82931', '中国航空工业总公司第六二八研究所');
INSERT INTO "edu"."sd_school" VALUES ('82932', '中航一集团北京长城计量测试研究所');
INSERT INTO "edu"."sd_school" VALUES ('82936', '中国航空研究院６１８所');
INSERT INTO "edu"."sd_school" VALUES ('82937', '中国航空研究院６４０所');
INSERT INTO "edu"."sd_school" VALUES ('82938', '中国航空研究院６０２所');
INSERT INTO "edu"."sd_school" VALUES ('82961', '中国航空研究院610所');
INSERT INTO "edu"."sd_school" VALUES ('83000', '中国电子科技集团公司电子科学研究院');
INSERT INTO "edu"."sd_school" VALUES ('83001', '华北计算机系统工程研究所');
INSERT INTO "edu"."sd_school" VALUES ('83002', '华北计算技术研究所');
INSERT INTO "edu"."sd_school" VALUES ('83003', '北京真空电子技术研究所');
INSERT INTO "edu"."sd_school" VALUES ('83004', '河北半导体所（13所）');
INSERT INTO "edu"."sd_school" VALUES ('83005', '南京电子技术研究所');
INSERT INTO "edu"."sd_school" VALUES ('83006', '中国电波传播研究所');
INSERT INTO "edu"."sd_school" VALUES ('83007', '南京电子器件研究所');
INSERT INTO "edu"."sd_school" VALUES ('83008', '西南通信研究所（３０所）');
INSERT INTO "edu"."sd_school" VALUES ('83009', '华东计算技术研究所');
INSERT INTO "edu"."sd_school" VALUES ('83010', '通信测控技术研究所（54所）');
INSERT INTO "edu"."sd_school" VALUES ('83011', '华北光电技术研究所');
INSERT INTO "edu"."sd_school" VALUES ('83101', '西安近代化学研究所（２０４所）');
INSERT INTO "edu"."sd_school" VALUES ('83102', '内蒙古金属材料研究所（５２所）');
INSERT INTO "edu"."sd_school" VALUES ('83103', '西安应用光学研究所（２０５所）');
INSERT INTO "edu"."sd_school" VALUES ('83104', '昆明物理研究所（211所）');
INSERT INTO "edu"."sd_school" VALUES ('83105', '西南技术物理研究所（２０９所）');
INSERT INTO "edu"."sd_school" VALUES ('83106', '中国北方自动控制技术研究所');
INSERT INTO "edu"."sd_school" VALUES ('83107', '中国北方车辆研究所');
INSERT INTO "edu"."sd_school" VALUES ('83109', '西安机电信息技术研究所');
INSERT INTO "edu"."sd_school" VALUES ('83110', '陕西应用物理化学研究所（２１３）');
INSERT INTO "edu"."sd_school" VALUES ('83111', '西北机电工程研究所（２０２所）');
INSERT INTO "edu"."sd_school" VALUES ('83112', '西安现代控制技术研究所');
INSERT INTO "edu"."sd_school" VALUES ('83113', '中国兵器工业第２０６研究所');
INSERT INTO "edu"."sd_school" VALUES ('83114', '西南自动化研究所');
INSERT INTO "edu"."sd_school" VALUES ('83115', '五三研究所');
INSERT INTO "edu"."sd_school" VALUES ('83116', '中国兵器装备研究院');
INSERT INTO "edu"."sd_school" VALUES ('83201', '中国航天科技集团公司第一研究院');
INSERT INTO "edu"."sd_school" VALUES ('83221', '中国航天科工集团第二研究院');
INSERT INTO "edu"."sd_school" VALUES ('83232', '北京信息控制研究所');
INSERT INTO "edu"."sd_school" VALUES ('83233', '西安航天科技工业总公司１６所');
INSERT INTO "edu"."sd_school" VALUES ('83241', '中国航天科工集团第三研究院');
INSERT INTO "edu"."sd_school" VALUES ('83245', '航天机电集团公司三院８３５７所');
INSERT INTO "edu"."sd_school" VALUES ('83246', '航天机电集团公司三院８３５８所');
INSERT INTO "edu"."sd_school" VALUES ('83256', '航天动力技术研究院');
INSERT INTO "edu"."sd_school" VALUES ('83258', '航天化学动力技术研究院４２所');
INSERT INTO "edu"."sd_school" VALUES ('83266', '中国空间技术研究院（航天五院）');
INSERT INTO "edu"."sd_school" VALUES ('83269', '中国空间技术研究院５０４所');
INSERT INTO "edu"."sd_school" VALUES ('83271', '中国空间技术研究院５１０所');
INSERT INTO "edu"."sd_school" VALUES ('83276', '中国航天电子基础技术研究院７７１所');
INSERT INTO "edu"."sd_school" VALUES ('83277', '中国航天科技集团公司第七○一研究所');
INSERT INTO "edu"."sd_school" VALUES ('83278', '中国航天科技集团公司六院十一所');
INSERT INTO "edu"."sd_school" VALUES ('83285', '上海航天技术研究院（航天八院）');
INSERT INTO "edu"."sd_school" VALUES ('83286', '中国江南航天工业集团０６１基地');
INSERT INTO "edu"."sd_school" VALUES ('83302', '煤炭科学研究总院重庆分院');
INSERT INTO "edu"."sd_school" VALUES ('83303', '煤科院上海分院');
INSERT INTO "edu"."sd_school" VALUES ('83304', '煤科总院抚顺分院');
INSERT INTO "edu"."sd_school" VALUES ('83306', '煤科院西安分院');
INSERT INTO "edu"."sd_school" VALUES ('83307', '煤炭科学研究总院唐山分院');
INSERT INTO "edu"."sd_school" VALUES ('83309', '煤科院北京建井研究所');
INSERT INTO "edu"."sd_school" VALUES ('83310', '煤科院北京煤化研究所');
INSERT INTO "edu"."sd_school" VALUES ('83311', '煤科院北京开采研究所');
INSERT INTO "edu"."sd_school" VALUES ('83401', '中国石油勘探开发研究院');
INSERT INTO "edu"."sd_school" VALUES ('83501', '北京化工研究院');
INSERT INTO "edu"."sd_school" VALUES ('83502', '上海化工研究院');
INSERT INTO "edu"."sd_school" VALUES ('83503', '沈阳化工研究院');
INSERT INTO "edu"."sd_school" VALUES ('83504', '北京橡胶工业研究设计院');
INSERT INTO "edu"."sd_school" VALUES ('83505', '化工机械及自动化研究设计院');
INSERT INTO "edu"."sd_school" VALUES ('83702', '中国轻工总会环境保护研究所');
INSERT INTO "edu"."sd_school" VALUES ('83703', '上海香料研究所');
INSERT INTO "edu"."sd_school" VALUES ('83704', '中国日用化学工业研究院');
INSERT INTO "edu"."sd_school" VALUES ('83705', '中国食品发酵工业研究院');
INSERT INTO "edu"."sd_school" VALUES ('83706', '中国制浆造纸研究院');
INSERT INTO "edu"."sd_school" VALUES ('83801', '铁道科学研究院');
INSERT INTO "edu"."sd_school" VALUES ('83901', '上海船舶运输科学研究所');
INSERT INTO "edu"."sd_school" VALUES ('83902', '交通部公路科学研究所');
INSERT INTO "edu"."sd_school" VALUES ('84001', '电信科学技术研究院');
INSERT INTO "edu"."sd_school" VALUES ('84002', '电信科学技术第一研究所（上海）');
INSERT INTO "edu"."sd_school" VALUES ('84003', '电信科学技术第四研究所（西安）');
INSERT INTO "edu"."sd_school" VALUES ('84004', '电信科学技术第五研究所');
INSERT INTO "edu"."sd_school" VALUES ('84011', '武汉邮电科学研究院');
INSERT INTO "edu"."sd_school" VALUES ('84201', '中国艺术研究院');
INSERT INTO "edu"."sd_school" VALUES ('84202', '中国电影艺术研究中心');
INSERT INTO "edu"."sd_school" VALUES ('84501', '中国疾病预防控制中心');
INSERT INTO "edu"."sd_school" VALUES ('84502', '中国中医研究院');
INSERT INTO "edu"."sd_school" VALUES ('84503', '中国药品生物制品检定所');
INSERT INTO "edu"."sd_school" VALUES ('84504', '北京生物制品研究所');
INSERT INTO "edu"."sd_school" VALUES ('84505', '上海生物制品研究所');
INSERT INTO "edu"."sd_school" VALUES ('84506', '武汉生物制品研究所');
INSERT INTO "edu"."sd_school" VALUES ('84507', '兰州生物制品研究所');
INSERT INTO "edu"."sd_school" VALUES ('84508', '中日友好临床医学研究所');
INSERT INTO "edu"."sd_school" VALUES ('84509', '长春生物制品研究所');
INSERT INTO "edu"."sd_school" VALUES ('84512', '卫生部北京老年医学研究所');
INSERT INTO "edu"."sd_school" VALUES ('84901', '中国建筑材料科学研究院');
INSERT INTO "edu"."sd_school" VALUES ('85101', '中国气象科学研究院');
INSERT INTO "edu"."sd_school" VALUES ('85301', '第一海洋研究所');
INSERT INTO "edu"."sd_school" VALUES ('85302', '国家海洋局第二海洋研究所');
INSERT INTO "edu"."sd_school" VALUES ('85303', '第三海洋研究所');
INSERT INTO "edu"."sd_school" VALUES ('85304', '国家海洋环境预报研究中心');
INSERT INTO "edu"."sd_school" VALUES ('85305', '国家海洋中心');
INSERT INTO "edu"."sd_school" VALUES ('85401', '中国地震局地球物理研究所');
INSERT INTO "edu"."sd_school" VALUES ('85402', '中国地震局地质研究所');
INSERT INTO "edu"."sd_school" VALUES ('85403', '国家地震局兰州地震研究所');
INSERT INTO "edu"."sd_school" VALUES ('85404', '中国地震局地震研究所');
INSERT INTO "edu"."sd_school" VALUES ('85405', '中国地震局分析预报中心');
INSERT INTO "edu"."sd_school" VALUES ('85406', '中国地震局工程力学研究所');
INSERT INTO "edu"."sd_school" VALUES ('85407', '中国地震局地壳应力研究所');
INSERT INTO "edu"."sd_school" VALUES ('85801', '中国计量科学研究院');
INSERT INTO "edu"."sd_school" VALUES ('85901', '上海医药工业研究院');
INSERT INTO "edu"."sd_school" VALUES ('85902', '四川抗菌素工业研究所');
INSERT INTO "edu"."sd_school" VALUES ('86001', '中国测绘科学研究院');
INSERT INTO "edu"."sd_school" VALUES ('86202', '武汉数字工程研究所');
INSERT INTO "edu"."sd_school" VALUES ('86203', '中国舰船研究设计中心(701所)');
INSERT INTO "edu"."sd_school" VALUES ('86204', '杭州应用声学研究所');
INSERT INTO "edu"."sd_school" VALUES ('86205', '中国船舶科学研究中心');
INSERT INTO "edu"."sd_school" VALUES ('86206', '上海船舶及海洋工程研究所');
INSERT INTO "edu"."sd_school" VALUES ('86207', '上海船舶设备研究所');
INSERT INTO "edu"."sd_school" VALUES ('86208', '上海船用柴油机研究所');
INSERT INTO "edu"."sd_school" VALUES ('86209', '哈尔滨船舶锅炉涡轮机研究所');
INSERT INTO "edu"."sd_school" VALUES ('86210', '江苏自动化研究所');
INSERT INTO "edu"."sd_school" VALUES ('86211', '天津航海仪器研究所（７０７所）');
INSERT INTO "edu"."sd_school" VALUES ('86212', '西安精密机械研究所');
INSERT INTO "edu"."sd_school" VALUES ('86213', '郑州机电工程研究所');
INSERT INTO "edu"."sd_school" VALUES ('86214', '洛阳船舶材料研究所');
INSERT INTO "edu"."sd_school" VALUES ('86215', '武汉船用电力推进装置研究所');
INSERT INTO "edu"."sd_school" VALUES ('86216', '华中光电技术研究所');
INSERT INTO "edu"."sd_school" VALUES ('86217', '武汉船舶通信研究所');
INSERT INTO "edu"."sd_school" VALUES ('86218', '武汉第二船舶设计研究');
INSERT INTO "edu"."sd_school" VALUES ('86219', '上海船舶电子设备研究所');
INSERT INTO "edu"."sd_school" VALUES ('86220', '大连测控技术研究所');
INSERT INTO "edu"."sd_school" VALUES ('86221', '邯郸净化设备研究所（718所）');
INSERT INTO "edu"."sd_school" VALUES ('86222', '宜昌测试技术研究所');
INSERT INTO "edu"."sd_school" VALUES ('86301', '石油化工科学研究院');
INSERT INTO "edu"."sd_school" VALUES ('86401', '昆明贵金属研究所');
INSERT INTO "edu"."sd_school" VALUES ('86402', '北京矿冶研究总院');
INSERT INTO "edu"."sd_school" VALUES ('86403', '北京有色金属研究总院');
INSERT INTO "edu"."sd_school" VALUES ('86404', '长沙矿山研究院');
INSERT INTO "edu"."sd_school" VALUES ('86601', '郑州烟草研究院');
INSERT INTO "edu"."sd_school" VALUES ('87102', '北京市科研院劳动保护研究所');
INSERT INTO "edu"."sd_school" VALUES ('87103', '北京市环境保护科学研究院');
INSERT INTO "edu"."sd_school" VALUES ('87110', '北京市心肺血管疾病研究所');
INSERT INTO "edu"."sd_school" VALUES ('87111', '北京市市政工程研究院');
INSERT INTO "edu"."sd_school" VALUES ('87112', '北京市结核病胸部肿瘤研究所');
INSERT INTO "edu"."sd_school" VALUES ('87113', '北京市创伤骨科研究所');
INSERT INTO "edu"."sd_school" VALUES ('87114', '北京市中医研究所');
INSERT INTO "edu"."sd_school" VALUES ('87120', '首都儿科研究所');
INSERT INTO "edu"."sd_school" VALUES ('87401', '山西省中医药研究院');
INSERT INTO "edu"."sd_school" VALUES ('87801', '黑龙江省中医研究院');
INSERT INTO "edu"."sd_school" VALUES ('87802', '黑龙江省社会科学院');
INSERT INTO "edu"."sd_school" VALUES ('87804', '黑龙江省科学院');
INSERT INTO "edu"."sd_school" VALUES ('87901', '上海市计算技术研究所');
INSERT INTO "edu"."sd_school" VALUES ('87902', '上海国际问题研究所');
INSERT INTO "edu"."sd_school" VALUES ('87903', '上海社会科学院');
INSERT INTO "edu"."sd_school" VALUES ('88001', '江苏省植物研究所');
INSERT INTO "edu"."sd_school" VALUES ('88002', '江苏省血吸虫病防治研究所');
INSERT INTO "edu"."sd_school" VALUES ('88101', '浙江省医学科学院');
INSERT INTO "edu"."sd_school" VALUES ('88501', '山东省医学科学院');
INSERT INTO "edu"."sd_school" VALUES ('88701', '湖北省社会科学院');
INSERT INTO "edu"."sd_school" VALUES ('88711', '湖北省化学研究所');
INSERT INTO "edu"."sd_school" VALUES ('88801', '湖南省中医药研究院');
INSERT INTO "edu"."sd_school" VALUES ('88901', '广东省社会科学院');
INSERT INTO "edu"."sd_school" VALUES ('88911', '广东省心血管病研究所');
INSERT INTO "edu"."sd_school" VALUES ('89101', '四川省社会科学院');
INSERT INTO "edu"."sd_school" VALUES ('89611', '中共北京市委党校');
INSERT INTO "edu"."sd_school" VALUES ('89621', '中共辽宁省委党校');
INSERT INTO "edu"."sd_school" VALUES ('89622', '中共吉林省委党校');
INSERT INTO "edu"."sd_school" VALUES ('89623', '中共黑龙江省委党校');
INSERT INTO "edu"."sd_school" VALUES ('89631', '中共上海市委党校');
INSERT INTO "edu"."sd_school" VALUES ('89632', '中共江苏省委党校');
INSERT INTO "edu"."sd_school" VALUES ('89633', '中共浙江省委党校');
INSERT INTO "edu"."sd_school" VALUES ('89637', '山东省委党校');
INSERT INTO "edu"."sd_school" VALUES ('89642', '中共湖北省委党校');
INSERT INTO "edu"."sd_school" VALUES ('89643', '中共湖南省委党校');
INSERT INTO "edu"."sd_school" VALUES ('89644', '中共广东省委党校');
INSERT INTO "edu"."sd_school" VALUES ('89651', '中共四川省委党校');
INSERT INTO "edu"."sd_school" VALUES ('89655', '中共重庆市委党校');
INSERT INTO "edu"."sd_school" VALUES ('89661', '中共陕西省委党校');
INSERT INTO "edu"."sd_school" VALUES ('90001', '国防大学');
INSERT INTO "edu"."sd_school" VALUES ('90002', '国防科学技术大学');
INSERT INTO "edu"."sd_school" VALUES ('90003', '石家庄陆军指挥学院');
INSERT INTO "edu"."sd_school" VALUES ('90004', '南京陆军指挥学院');
INSERT INTO "edu"."sd_school" VALUES ('90005', '解放军信息工程大学');
INSERT INTO "edu"."sd_school" VALUES ('90006', '解放军理工大学');
INSERT INTO "edu"."sd_school" VALUES ('90007', '解放军体育学院');
INSERT INTO "edu"."sd_school" VALUES ('90008', '解放军国际关系学院');
INSERT INTO "edu"."sd_school" VALUES ('90009', '解放军外国语学院');
INSERT INTO "edu"."sd_school" VALUES ('90010', '通信指挥学院');
INSERT INTO "edu"."sd_school" VALUES ('90011', '重庆通信学院');
INSERT INTO "edu"."sd_school" VALUES ('90012', '西安通信学院');
INSERT INTO "edu"."sd_school" VALUES ('90013', '炮兵指挥学院');
INSERT INTO "edu"."sd_school" VALUES ('90014', '炮兵学院');
INSERT INTO "edu"."sd_school" VALUES ('90016', '解放军防空兵指挥学院');
INSERT INTO "edu"."sd_school" VALUES ('90017', '廊坊陆军导弹学院');
INSERT INTO "edu"."sd_school" VALUES ('90018', '蚌埠坦克学院');
INSERT INTO "edu"."sd_school" VALUES ('90019', '工程兵指挥学院');
INSERT INTO "edu"."sd_school" VALUES ('90020', '防化指挥工程学院');
INSERT INTO "edu"."sd_school" VALUES ('90021', '电子工程学院');
INSERT INTO "edu"."sd_school" VALUES ('90022', '军事交通学院');
INSERT INTO "edu"."sd_school" VALUES ('90023', '西安政治学院');
INSERT INTO "edu"."sd_school" VALUES ('90024', '南京政治学院');
INSERT INTO "edu"."sd_school" VALUES ('90025', '解放军艺术学院');
INSERT INTO "edu"."sd_school" VALUES ('90026', '后勤指挥学院');
INSERT INTO "edu"."sd_school" VALUES ('90027', '后勤工程学院');
INSERT INTO "edu"."sd_school" VALUES ('90028', '军事经济学院');
INSERT INTO "edu"."sd_school" VALUES ('90029', '军需大学');
INSERT INTO "edu"."sd_school" VALUES ('90031', '汽车管理学院');
INSERT INTO "edu"."sd_school" VALUES ('90033', '第一军医大学');
INSERT INTO "edu"."sd_school" VALUES ('90034', '第二军医大学');
INSERT INTO "edu"."sd_school" VALUES ('90035', '第三军医大学');
INSERT INTO "edu"."sd_school" VALUES ('90036', '第四军医大学');
INSERT INTO "edu"."sd_school" VALUES ('90037', '军医进修学院');
INSERT INTO "edu"."sd_school" VALUES ('90039', '装备指挥技术学院');
INSERT INTO "edu"."sd_school" VALUES ('90040', '军械工程学院');
INSERT INTO "edu"."sd_school" VALUES ('90041', '装甲兵工程学院');
INSERT INTO "edu"."sd_school" VALUES ('90043', '海军指挥学院');
INSERT INTO "edu"."sd_school" VALUES ('90044', '海军工程大学');
INSERT INTO "edu"."sd_school" VALUES ('90045', '海军航空工程学院');
INSERT INTO "edu"."sd_school" VALUES ('90046', '海军大连舰艇学院');
INSERT INTO "edu"."sd_school" VALUES ('90047', '海军兵种指挥学院');
INSERT INTO "edu"."sd_school" VALUES ('90048', '海军潜艇学院');
INSERT INTO "edu"."sd_school" VALUES ('90051', '空军指挥学院');
INSERT INTO "edu"."sd_school" VALUES ('90052', '空军工程大学');
INSERT INTO "edu"."sd_school" VALUES ('90053', '空军雷达学院');
INSERT INTO "edu"."sd_school" VALUES ('90055', '徐州空军学院');
INSERT INTO "edu"."sd_school" VALUES ('90057', '空军第二航空学院');
INSERT INTO "edu"."sd_school" VALUES ('90067', '第二炮兵指挥学院');
INSERT INTO "edu"."sd_school" VALUES ('90068', '第二炮兵工程学院');
INSERT INTO "edu"."sd_school" VALUES ('90101', '军事科学院');
INSERT INTO "edu"."sd_school" VALUES ('90102', '总参第五十六研究所');
INSERT INTO "edu"."sd_school" VALUES ('90103', '总参第五十七研究所');
INSERT INTO "edu"."sd_school" VALUES ('90104', '总参谋部第五十八研究所');
INSERT INTO "edu"."sd_school" VALUES ('90105', '防化研究院');
INSERT INTO "edu"."sd_school" VALUES ('90106', '军事医学科学院');
INSERT INTO "edu"."sd_school" VALUES ('90107', '海军装备研究院');
INSERT INTO "edu"."sd_school" VALUES ('90109', '航天医学工程研究所');
INSERT INTO "edu"."sd_school" VALUES ('90110', '北京跟踪与通信技术研究所');
INSERT INTO "edu"."sd_school" VALUES ('90111', '中国国防科技信息中心');
INSERT INTO "edu"."sd_school" VALUES ('90112', '西北核技术研究所');
INSERT INTO "edu"."sd_school" VALUES ('90113', '中国空气动力研究与发展中心');
INSERT INTO "edu"."sd_school" VALUES ('90114', '北京系统工程研究所');
INSERT INTO "edu"."sd_school" VALUES ('90202', '武警工程学院');

-- ----------------------------
-- Table structure for "edu"."sd_zzu_major"
-- ----------------------------
DROP TABLE "edu"."sd_zzu_major";
CREATE TABLE "edu"."sd_zzu_major" (
"majorid" numeric(10) NOT NULL,
"majorname" varchar(255) NOT NULL,
"majorshorname" varchar(255) NOT NULL,
"majorcode" varchar(255) NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."sd_zzu_major" IS '静态数据 -- 郑州大学专业代码列表对照';
COMMENT ON COLUMN "edu"."sd_zzu_major"."majorid" IS '专业号';
COMMENT ON COLUMN "edu"."sd_zzu_major"."majorname" IS '专业名称';
COMMENT ON COLUMN "edu"."sd_zzu_major"."majorshorname" IS '专业简称';
COMMENT ON COLUMN "edu"."sd_zzu_major"."majorcode" IS '专业代码';

-- ----------------------------
-- Records of sd_zzu_major
-- ----------------------------
INSERT INTO "edu"."sd_zzu_major" VALUES ('2', '法学', '法学', '080605');
INSERT INTO "edu"."sd_zzu_major" VALUES ('4', '工商管理', '工商管理', '100701');
INSERT INTO "edu"."sd_zzu_major" VALUES ('6', '计算机科学与技术', '计算机', '100801');
INSERT INTO "edu"."sd_zzu_major" VALUES ('12', '护理学', '护理', '050101');
INSERT INTO "edu"."sd_zzu_major" VALUES ('14', '药学', '药学', '110209');
INSERT INTO "edu"."sd_zzu_major" VALUES ('16', '汉语言文学', '汉语言', '020104');
INSERT INTO "edu"."sd_zzu_major" VALUES ('18', '电子商务', '电子商务', '110209');
INSERT INTO "edu"."sd_zzu_major" VALUES ('20', '金融学', '金融学', '110203');
INSERT INTO "edu"."sd_zzu_major" VALUES ('21', '旅游管理', '旅游管理', '110102');
INSERT INTO "edu"."sd_zzu_major" VALUES ('22', '会计学', '会计学', '080601');
INSERT INTO "edu"."sd_zzu_major" VALUES ('24', '信息管理与信息系统', '信息管理', '100101');
INSERT INTO "edu"."sd_zzu_major" VALUES ('25', '电气工程及其自动化', '电气工程', '080703');
INSERT INTO "edu"."sd_zzu_major" VALUES ('26', '基础医学', '基础医学', '040101');
INSERT INTO "edu"."sd_zzu_major" VALUES ('27', '土木工程', '土木工程', '050201');
INSERT INTO "edu"."sd_zzu_major" VALUES ('28', '教育学', '教育学', '050102');
INSERT INTO "edu"."sd_zzu_major" VALUES ('29', '英语', '英语', '050201');
INSERT INTO "edu"."sd_zzu_major" VALUES ('30', '教育学(语文教育)', '语文教育', '030404');
INSERT INTO "edu"."sd_zzu_major" VALUES ('31', '教育学(英语教育)', '英语教育', '110302');
INSERT INTO "edu"."sd_zzu_major" VALUES ('32', '思想政治教育', '思政教育', '040105');
INSERT INTO "edu"."sd_zzu_major" VALUES ('33', '教育学(教育管理)', '教育管理', '070304');
INSERT INTO "edu"."sd_zzu_major" VALUES ('34', '小学教育', '小学教育', '070202');
INSERT INTO "edu"."sd_zzu_major" VALUES ('35', '教育学(化学教育)', '化学教育', '070102');
INSERT INTO "edu"."sd_zzu_major" VALUES ('36', '教育学(物理教育)', '物理教育', '030101');
INSERT INTO "edu"."sd_zzu_major" VALUES ('37', '教育学(数学教育)', '数学教育', '110203');
INSERT INTO "edu"."sd_zzu_major" VALUES ('71', '法律事务(专)', '法律事务', '110201');
INSERT INTO "edu"."sd_zzu_major" VALUES ('72', '艺术设计(专)', '艺术设计', '020104');
INSERT INTO "edu"."sd_zzu_major" VALUES ('73', '工商企业管理(专)', '工企管理', '110203');
INSERT INTO "edu"."sd_zzu_major" VALUES ('74', '金融学(专)', '金融学专', '110203');
INSERT INTO "edu"."sd_zzu_major" VALUES ('75', '财务管理(专)', '财务管理', '080605');
INSERT INTO "edu"."sd_zzu_major" VALUES ('76', '经济管理(专)', '经济管理', '110203');
INSERT INTO "edu"."sd_zzu_major" VALUES ('77', '计算机应用技术(专)', '计算机专', '080601');
INSERT INTO "edu"."sd_zzu_major" VALUES ('78', '教育管理(专)', '教育管理', '110301');
INSERT INTO "edu"."sd_zzu_major" VALUES ('79', '电力系统继电保护与自动化(专)', '电气专科', '080703');
INSERT INTO "edu"."sd_zzu_major" VALUES ('81', '建筑工程技术(专)', '建筑工程', '100701');
INSERT INTO "edu"."sd_zzu_major" VALUES ('82', '护理(专)', '护理专科', '100801');
INSERT INTO "edu"."sd_zzu_major" VALUES ('84', '计算机网络技术(专)', '网络技术', '080613');
INSERT INTO "edu"."sd_zzu_major" VALUES ('85', '药学(专)', '药学专科', '630301');
INSERT INTO "edu"."sd_zzu_major" VALUES ('86', '旅游管理(酒店管理方向)(专)', '旅游管理', '100801');
INSERT INTO "edu"."sd_zzu_major" VALUES ('87', '机电一体化技术(专)', '机电专科', '100801');
INSERT INTO "edu"."sd_zzu_major" VALUES ('88', '物流管理(专)', '物流管理', '620505');
INSERT INTO "edu"."sd_zzu_major" VALUES ('89', '人力资源管理(专)', '人力资源', '650204');
INSERT INTO "edu"."sd_zzu_major" VALUES ('90', '工程造价(专)', '工程造价', '560502');
INSERT INTO "edu"."sd_zzu_major" VALUES ('91', '会计电算化(专)', '会计电算化', '620204');

-- ----------------------------
-- Table structure for "edu"."student_change"
-- ----------------------------
DROP TABLE "edu"."student_change";
CREATE TABLE "edu"."student_change" (
"change_id" numeric(5) DEFAULT fun_table_seq('student_change'::character varying, 'change_id'::character varying, 'next'::character varying) NOT NULL,
"student_id" numeric(5) NOT NULL,
"change_content" text,
"register_date" timestamp(6) DEFAULT now() NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."student_change" IS '学籍异动管理';
COMMENT ON COLUMN "edu"."student_change"."change_id" IS '更改代码';
COMMENT ON COLUMN "edu"."student_change"."student_id" IS '学生代码';
COMMENT ON COLUMN "edu"."student_change"."change_content" IS '更改内容';
COMMENT ON COLUMN "edu"."student_change"."register_date" IS '登记时间';

-- ----------------------------
-- Records of student_change
-- ----------------------------

-- ----------------------------
-- Table structure for "edu"."student_classified"
-- ----------------------------
DROP TABLE "edu"."student_classified";
CREATE TABLE "edu"."student_classified" (
"classified_id" numeric(5) DEFAULT fun_table_seq('student_classified'::character varying, 'classified_id'::character varying, 'next'::character varying) NOT NULL,
"classified_name" varchar(255) NOT NULL,
"register_date" timestamp(6) DEFAULT now() NOT NULL,
"default_lol" numeric(1) DEFAULT 2 NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."student_classified" IS '学生类别代码维护';
COMMENT ON COLUMN "edu"."student_classified"."classified_id" IS '类别代码';
COMMENT ON COLUMN "edu"."student_classified"."classified_name" IS '类别名称';
COMMENT ON COLUMN "edu"."student_classified"."register_date" IS '登记时间';
COMMENT ON COLUMN "edu"."student_classified"."default_lol" IS '缺省学制(年)';

-- ----------------------------
-- Records of student_classified
-- ----------------------------
INSERT INTO "edu"."student_classified" VALUES ('1', '高起专', '2012-02-09 18:11:14.37', '3');
INSERT INTO "edu"."student_classified" VALUES ('2', '专升本', '2012-02-09 18:11:18.7', '2');
INSERT INTO "edu"."student_classified" VALUES ('3', '本科', '2012-02-09 18:11:21.94', '1');
INSERT INTO "edu"."student_classified" VALUES ('7', '专科', '2012-02-12 11:03:47.695', '2');

-- ----------------------------
-- Table structure for "edu"."student_info"
-- ----------------------------
DROP TABLE "edu"."student_info";
CREATE TABLE "edu"."student_info" (
"student_id" numeric(5) DEFAULT fun_table_seq('student_info'::character varying, 'student_id'::character varying, 'next'::character varying) NOT NULL,
"student_name" varchar(255) NOT NULL,
"identity_card" varchar(19) NOT NULL,
"student_sex" varchar(2) NOT NULL,
"exam_num" varchar(255),
"student_address" varchar(255),
"student_phone" varchar(255) NOT NULL,
"student_linkman" varchar(255),
"linkman_phone" varchar(255),
"student_college_id" varchar(255),
"college_owner" numeric(5),
"batch_owner" numeric(5),
"classified_owner" numeric(5),
"subject_owner" numeric(5),
"agent_owner" numeric(5),
"fund_agent" numeric(5),
"managed_agent" numeric(5),
"stu_status_id" numeric(5),
"register_date" timestamp(6) DEFAULT now() NOT NULL,
"update_date" timestamp(6),
"birthday" varchar(255) NOT NULL,
"ethnic_group_id" numeric(5),
"political_status_id" numeric(5),
"employer" varchar(255),
"graduate_college_id" numeric(5),
"graduate_date" timestamp(6),
"graduate_certificate_number" varchar(255),
"postal_code" varchar(255),
"student_type_id" numeric(5),
"major_category_id" numeric(5)
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."student_info" IS '学生基本信息管理';
COMMENT ON COLUMN "edu"."student_info"."student_id" IS '学生代码';
COMMENT ON COLUMN "edu"."student_info"."student_name" IS '学生姓名';
COMMENT ON COLUMN "edu"."student_info"."identity_card" IS '学生身份证号';
COMMENT ON COLUMN "edu"."student_info"."exam_num" IS '准考证号';
COMMENT ON COLUMN "edu"."student_info"."student_address" IS '地址';
COMMENT ON COLUMN "edu"."student_info"."student_phone" IS '电话';
COMMENT ON COLUMN "edu"."student_info"."student_linkman" IS '联系人';
COMMENT ON COLUMN "edu"."student_info"."linkman_phone" IS '联系人电话';
COMMENT ON COLUMN "edu"."student_info"."student_college_id" IS '学生学校学号';
COMMENT ON COLUMN "edu"."student_info"."college_owner" IS '隶属学校';
COMMENT ON COLUMN "edu"."student_info"."batch_owner" IS '隶属批次';
COMMENT ON COLUMN "edu"."student_info"."classified_owner" IS '隶属层次';
COMMENT ON COLUMN "edu"."student_info"."subject_owner" IS '隶属专业';
COMMENT ON COLUMN "edu"."student_info"."agent_owner" IS '隶属招生点';
COMMENT ON COLUMN "edu"."student_info"."fund_agent" IS '费用接收机构';
COMMENT ON COLUMN "edu"."student_info"."managed_agent" IS '学生管理机构';
COMMENT ON COLUMN "edu"."student_info"."stu_status_id" IS '学生状态';
COMMENT ON COLUMN "edu"."student_info"."register_date" IS '登记时间';
COMMENT ON COLUMN "edu"."student_info"."update_date" IS '更改时间';
COMMENT ON COLUMN "edu"."student_info"."birthday" IS '出生年月日';
COMMENT ON COLUMN "edu"."student_info"."ethnic_group_id" IS '民族id';
COMMENT ON COLUMN "edu"."student_info"."political_status_id" IS '政治面貌';
COMMENT ON COLUMN "edu"."student_info"."employer" IS '工作单位';
COMMENT ON COLUMN "edu"."student_info"."graduate_college_id" IS '之前毕业学校ID';
COMMENT ON COLUMN "edu"."student_info"."graduate_date" IS '之前毕业时间（yyyymmdd)';
COMMENT ON COLUMN "edu"."student_info"."graduate_certificate_number" IS '之前毕业证号码';
COMMENT ON COLUMN "edu"."student_info"."postal_code" IS '邮政编码';
COMMENT ON COLUMN "edu"."student_info"."student_type_id" IS '学生类型';
COMMENT ON COLUMN "edu"."student_info"."major_category_id" IS '成教学生大类';

-- ----------------------------
-- Records of student_info
-- ----------------------------
INSERT INTO "edu"."student_info" VALUES ('1', '张三', '1234567', '男', '4444444', '与规范的', '11111', '李四', '1333333333', '1234567890', '12', '1', '1', '47', '10', '10', '10', '3', '2012-02-28 10:41:03.2965', null, '1330401600000', '9', '10', '会尽快了', '10360', '2012-02-28 12:00:00', '66666666', '99999', '4', '1');

-- ----------------------------
-- Table structure for "edu"."student_major_category"
-- ----------------------------
DROP TABLE "edu"."student_major_category";
CREATE TABLE "edu"."student_major_category" (
"student_major_category_id" numeric(5) DEFAULT fun_table_seq('student_major_category'::character varying, 'student_major_category_id'::character varying, 'next'::character varying) NOT NULL,
"student_major_category_name" varchar(255)
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."student_major_category" IS '成教大类';
COMMENT ON COLUMN "edu"."student_major_category"."student_major_category_id" IS '成教学生类型id';
COMMENT ON COLUMN "edu"."student_major_category"."student_major_category_name" IS '成教学生类型名称';

-- ----------------------------
-- Records of student_major_category
-- ----------------------------
INSERT INTO "edu"."student_major_category" VALUES ('1', '文史类');
INSERT INTO "edu"."student_major_category" VALUES ('2', '医学类');
INSERT INTO "edu"."student_major_category" VALUES ('3', '理工类');

-- ----------------------------
-- Table structure for "edu"."student_pic"
-- ----------------------------
DROP TABLE "edu"."student_pic";
CREATE TABLE "edu"."student_pic" (
"student_id" numeric(5) NOT NULL,
"pic_type_id" numeric(5) NOT NULL,
"pic" bytea,
"remark" varchar(255),
"register_date" timestamp(6) DEFAULT now() NOT NULL,
"update_date" timestamp(6)
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."student_pic" IS '学生照片';

-- ----------------------------
-- Records of student_pic
-- ----------------------------

-- ----------------------------
-- Table structure for "edu"."student_status"
-- ----------------------------
DROP TABLE "edu"."student_status";
CREATE TABLE "edu"."student_status" (
"stu_status_id" numeric(5) DEFAULT fun_table_seq('student_status'::character varying, 'stu_status_id'::character varying, 'next'::character varying) NOT NULL,
"stu_status_name" varchar(255) NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."student_status" IS '学生状态';
COMMENT ON COLUMN "edu"."student_status"."stu_status_id" IS '学生状态表';

-- ----------------------------
-- Records of student_status
-- ----------------------------
INSERT INTO "edu"."student_status" VALUES ('1', '正常');
INSERT INTO "edu"."student_status" VALUES ('2', '休学');
INSERT INTO "edu"."student_status" VALUES ('3', '退学');
INSERT INTO "edu"."student_status" VALUES ('4', '毕业');
INSERT INTO "edu"."student_status" VALUES ('5', '肄业');
INSERT INTO "edu"."student_status" VALUES ('7', '待考');

-- ----------------------------
-- Table structure for "edu"."student_type"
-- ----------------------------
DROP TABLE "edu"."student_type";
CREATE TABLE "edu"."student_type" (
"student_type_id" numeric(5) DEFAULT fun_table_seq('student_type'::character varying, 'student_type_id'::character varying, 'next'::character varying) NOT NULL,
"student_type_name" varchar(255)
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."student_type" IS '学生类型';
COMMENT ON COLUMN "edu"."student_type"."student_type_id" IS '学生类型id';
COMMENT ON COLUMN "edu"."student_type"."student_type_name" IS '学生类型名称';

-- ----------------------------
-- Records of student_type
-- ----------------------------
INSERT INTO "edu"."student_type" VALUES ('1', '远程');
INSERT INTO "edu"."student_type" VALUES ('2', '成教');
INSERT INTO "edu"."student_type" VALUES ('4', '自考');

-- ----------------------------
-- Table structure for "edu"."subjects"
-- ----------------------------
DROP TABLE "edu"."subjects";
CREATE TABLE "edu"."subjects" (
"subject_id" numeric(5) DEFAULT fun_table_seq('subjects'::character varying, 'subject_id'::character varying, 'next'::character varying) NOT NULL,
"subject_name" varchar(255) NOT NULL,
"register_date" timestamp(6) DEFAULT now() NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."subjects" IS '专业代码维护';
COMMENT ON COLUMN "edu"."subjects"."subject_id" IS '专业代码';
COMMENT ON COLUMN "edu"."subjects"."subject_name" IS '专业代码';
COMMENT ON COLUMN "edu"."subjects"."register_date" IS '登记时间';

-- ----------------------------
-- Records of subjects
-- ----------------------------
INSERT INTO "edu"."subjects" VALUES ('2', '法学', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('3', '工商管理', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('4', '计算机科学与技术', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('5', '护理学', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('6', '药学', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('7', '汉语言文学', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('8', '金融学', '2012-02-09 22:08:07.366');
INSERT INTO "edu"."subjects" VALUES ('9', '旅游管理', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('10', '会计学', '2012-02-09 22:08:07.366');
INSERT INTO "edu"."subjects" VALUES ('11', '信息管理与信息系统', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('12', '电气工程及其自动化', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('13', '教育学(物理教育)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('14', '教育学(数学教育)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('15', '法律事务(专)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('16', '艺术设计(专)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('17', '工商企业管理(专)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('18', '金融学(专)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('19', '财务管理(专)', '2012-02-09 22:08:07.366');
INSERT INTO "edu"."subjects" VALUES ('20', '经济管理(专)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('21', '计算机应用技术(专)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('22', '教育管理(专)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('23', '电力系统继电保护与自动化(专)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('24', '建筑工程技术(专)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('25', '计算机网络技术(专)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('26', '旅游管理(酒店管理方向)(专)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('27', '基础医学', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('28', '土木工程', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('29', '教育学', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('30', '英语', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('31', '教育学(语文教育)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('32', '教育学(英语教育)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('33', '思想政治教育', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('34', '教育学(教育管理)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('35', '小学教育', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('36', '教育学(化学教育)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('37', '机电一体化技术(专)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('38', '护理(专)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('39', '电子商务', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('40', '药学(专)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('41', '物流管理(专)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('42', '人力资源管理(专)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('43', '工程造价(专)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('44', '会计电算化(专)', '2012-02-09 22:08:07.366418');
INSERT INTO "edu"."subjects" VALUES ('46', '电力系统继电保护与自动化（专）', '2012-02-21 17:59:23.233045');
INSERT INTO "edu"."subjects" VALUES ('47', '安全工程', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('48', '安全技术管理', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('49', '材料物理(材料腐蚀与防护)', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('50', '财务管理', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('51', '城市燃气工程技术', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('52', '畜牧兽医 ', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('53', '电气工程及其自动化', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('54', '电气自动化技术', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('55', '电子商务', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('56', '动物科学', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('57', '动物医学', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('58', '法律事务 ', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('59', '法学', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('60', '房地产开发与经营', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('61', '工程管理', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('62', '工程造价', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('63', '工程造价管理', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('64', '工商管理', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('65', '工商企业管理 ', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('66', '工商企业管理(福建共赢鸿星尔克)福建共赢鸿星尔克', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('67', '公共事业管理', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('68', '供用电技术 ', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('69', '光电子技术', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('70', '汉语言文学', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('71', '行政管理 ', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('72', '化工工艺', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('73', '化学工程与工艺', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('74', '环境工程', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('75', '环境工程技术', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('76', '环境监测与治理技术 ', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('77', '会计', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('78', '会计学', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('79', '会计与统计核算 ', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('80', '机电一体化技术 ', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('81', '机械设计制造及其自动化', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('82', '机械制造与自动化', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('83', '计算机科学与技术', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('84', '计算机科学与技术(斯波泰克四)斯波泰克四', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('85', '计算机网络技术', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('86', '计算机网络技术(斯波泰克四)斯波泰克四', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('87', '计算机信息管理 ', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('88', '计算机应用技术', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('89', '建筑工程管理', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('90', '建筑工程技术 ', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('91', '教育技术学', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('92', '金融学', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('93', '金融学', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('94', '经济信息管理 ', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('95', '经济学', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('96', '酒店管理 ', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('97', '林学', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('98', '林业技术 ', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('99', '旅游管理 ', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('100', '农学', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('101', '农业电气化与自动化', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('102', '农业技术与管理 ', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('103', '企业资源计划管理', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('104', '人力资源管理', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('105', '三维动画设计', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('106', '社会工作 ', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('107', '石油化工生产技术', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('108', '市场营销 ', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('109', '水产养殖技术 ', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('110', '水产养殖学', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('111', '水利水电工程', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('112', '土地资源管理', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('113', '土木工程', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('114', '土木工程(工业与民用建筑)', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('115', '物流管理', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('116', '心理咨询(教育心理学) ', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('117', '信息管理与信息系统', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('118', '烟草', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('119', '烟草栽培技术(烟草生产经营与管理) ', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('120', '艺术设计', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('121', '应用英语', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('122', '油气储运工程', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('123', '油气储运工程(城市燃气输配)', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('124', '油气储运技术', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('125', '园林', '2012-02-27 16:39:42.615459');
INSERT INTO "edu"."subjects" VALUES ('126', '园林技术 ', '2012-02-27 16:39:42.615459');

-- ----------------------------
-- Table structure for "edu"."table_sequence"
-- ----------------------------
DROP TABLE "edu"."table_sequence";
CREATE TABLE "edu"."table_sequence" (
"table_name" varchar(255) NOT NULL,
"column_name" varchar(255) NOT NULL,
"seq_id" numeric(5) NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."table_sequence" IS '表计数器';
COMMENT ON COLUMN "edu"."table_sequence"."table_name" IS '表名';
COMMENT ON COLUMN "edu"."table_sequence"."column_name" IS '字段名';
COMMENT ON COLUMN "edu"."table_sequence"."seq_id" IS '序列号';

-- ----------------------------
-- Records of table_sequence
-- ----------------------------
INSERT INTO "edu"."table_sequence" VALUES ('agent_return', 'ag_return_id', '0');
INSERT INTO "edu"."table_sequence" VALUES ('agent_return_type', 'ag_return_type_id', '27');
INSERT INTO "edu"."table_sequence" VALUES ('agent_type', 'agent_type_id', '12');
INSERT INTO "edu"."table_sequence" VALUES ('agree_return', 'agree_return_id', '0');
INSERT INTO "edu"."table_sequence" VALUES ('bank_order', 'order_id', '0');
INSERT INTO "edu"."table_sequence" VALUES ('batch_index', 'batch_id', '91');
INSERT INTO "edu"."table_sequence" VALUES ('charge_admin', 'charge_id', '0');
INSERT INTO "edu"."table_sequence" VALUES ('charge_type', 'charge_type_id', '7');
INSERT INTO "edu"."table_sequence" VALUES ('co_college', 'college_id', '16');
INSERT INTO "edu"."table_sequence" VALUES ('college_agreement', 'agreement_id', '8');
INSERT INTO "edu"."table_sequence" VALUES ('derate_request', 'derate_id', '0');
INSERT INTO "edu"."table_sequence" VALUES ('fee_type', 'fee_id', '17');
INSERT INTO "edu"."table_sequence" VALUES ('messages', 'message_id', '84');
INSERT INTO "edu"."table_sequence" VALUES ('pic_type', 'pic_type_id', '6');
INSERT INTO "edu"."table_sequence" VALUES ('receive_fund', 'fund_id', '0');
INSERT INTO "edu"."table_sequence" VALUES ('recruit_agent', 'agent_id', '15');
INSERT INTO "edu"."table_sequence" VALUES ('refundment_admin', 'refund_id', '0');
INSERT INTO "edu"."table_sequence" VALUES ('student_change', 'change_id', '0');
INSERT INTO "edu"."table_sequence" VALUES ('student_classified', 'classified_id', '10');
INSERT INTO "edu"."table_sequence" VALUES ('student_info', 'student_id', '1');
INSERT INTO "edu"."table_sequence" VALUES ('student_major_category', 'student_major_category_id', '3');
INSERT INTO "edu"."table_sequence" VALUES ('student_status', 'stu_status_id', '7');
INSERT INTO "edu"."table_sequence" VALUES ('student_type', 'student_type_id', '5');
INSERT INTO "edu"."table_sequence" VALUES ('subjects', 'subject_id', '126');
INSERT INTO "edu"."table_sequence" VALUES ('user_admin', 'user_id', '4');
INSERT INTO "edu"."table_sequence" VALUES ('user_type', 'user_type_id', '8');

-- ----------------------------
-- Table structure for "edu"."test_a"
-- ----------------------------
DROP TABLE "edu"."test_a";
CREATE TABLE "edu"."test_a" (
"a" varchar(100),
"b" varchar(100)
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of test_a
-- ----------------------------
INSERT INTO "edu"."test_a" VALUES ('1', '2');
INSERT INTO "edu"."test_a" VALUES ('1', '2');
INSERT INTO "edu"."test_a" VALUES ('2', '3');

-- ----------------------------
-- Table structure for "edu"."test_b"
-- ----------------------------
DROP TABLE "edu"."test_b";
CREATE TABLE "edu"."test_b" (
"a" varchar(100),
"c" varchar(100)
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of test_b
-- ----------------------------
INSERT INTO "edu"."test_b" VALUES ('1', '2');

-- ----------------------------
-- Table structure for "edu"."test_c"
-- ----------------------------
DROP TABLE "edu"."test_c";
CREATE TABLE "edu"."test_c" (
"a" varchar(100)
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of test_c
-- ----------------------------
INSERT INTO "edu"."test_c" VALUES ('1');
INSERT INTO "edu"."test_c" VALUES ('2');

-- ----------------------------
-- Table structure for "edu"."user_admin"
-- ----------------------------
DROP TABLE "edu"."user_admin";
CREATE TABLE "edu"."user_admin" (
"user_id" numeric(5) DEFAULT fun_table_seq('user_admin'::character varying, 'user_id'::character varying, 'next'::character varying) NOT NULL,
"user_name" varchar(255) NOT NULL,
"user_password" varchar(255),
"user_type_id" numeric(5),
"user_status" bool,
"agent_id" numeric(5),
"register_date" timestamp(6) DEFAULT now() NOT NULL,
"update_date" timestamp(6) NOT NULL,
"display_name" varchar(255) NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."user_admin" IS '用户管理';
COMMENT ON COLUMN "edu"."user_admin"."user_id" IS '用户代码';
COMMENT ON COLUMN "edu"."user_admin"."user_name" IS '用户名称';
COMMENT ON COLUMN "edu"."user_admin"."user_type_id" IS '用户类型';
COMMENT ON COLUMN "edu"."user_admin"."user_status" IS '用户状态';
COMMENT ON COLUMN "edu"."user_admin"."agent_id" IS '隶属招生点';
COMMENT ON COLUMN "edu"."user_admin"."register_date" IS '登记时间';
COMMENT ON COLUMN "edu"."user_admin"."update_date" IS '更改时间';
COMMENT ON COLUMN "edu"."user_admin"."display_name" IS '显示名字';

-- ----------------------------
-- Records of user_admin
-- ----------------------------
INSERT INTO "edu"."user_admin" VALUES ('1', 'admin', '21232F297A57A5A743894A0E4A801FC3', '1', 't', '10', '2012-02-20 17:59:45.825', '2012-02-26 21:27:46.513', 'God');
INSERT INTO "edu"."user_admin" VALUES ('2', 'admin2', 'admin2', '1', 't', '10', '2012-02-20 22:06:41.813587', '2012-02-20 22:07:34.185', 'God?');
INSERT INTO "edu"."user_admin" VALUES ('3', 'admin3', 'admin3', '3', 't', '10', '2012-02-20 22:07:06.170606', '2012-02-20 22:07:58.546', 'Nobody');

-- ----------------------------
-- Table structure for "edu"."user_type"
-- ----------------------------
DROP TABLE "edu"."user_type";
CREATE TABLE "edu"."user_type" (
"user_type_id" numeric(5) DEFAULT fun_table_seq('user_type'::character varying, 'user_type_id'::character varying, 'next'::character varying) NOT NULL,
"user_type_name" varchar(255) NOT NULL
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "edu"."user_type" IS '用户类型';

-- ----------------------------
-- Records of user_type
-- ----------------------------
INSERT INTO "edu"."user_type" VALUES ('1', '全局管理员');
INSERT INTO "edu"."user_type" VALUES ('2', '学生');
INSERT INTO "edu"."user_type" VALUES ('3', '财务');
INSERT INTO "edu"."user_type" VALUES ('4', '招生点操作员');
INSERT INTO "edu"."user_type" VALUES ('5', '学习中心管理员');
INSERT INTO "edu"."user_type" VALUES ('6', '学习中心老师');

-- ----------------------------
-- View structure for "edu"."college_subject_view"
-- ----------------------------
CREATE OR REPLACE VIEW "edu"."college_subject_view" AS 
SELECT college_subject.college_id, college_subject.batch_id, college_subject.classified_id, college_subject.subeject_id, subjects.subject_name, college_subject.length_of_schooling FROM college_subject, subjects WHERE (college_subject.subeject_id = subjects.subject_id);

-- ----------------------------
-- View structure for "edu"."messages_real"
-- ----------------------------
CREATE OR REPLACE VIEW "edu"."messages_real" AS 
SELECT a.message_id, a.from_user, b.user_name AS from_user_name, a.to_user, c.user_name AS to_user_name, a.message, a.receive_tstp FROM messages a, user_admin b, user_admin c WHERE (((a.from_user = b.user_id) AND (a.to_user = c.user_id)) AND (a.is_read = false));

-- ----------------------------
-- View structure for "edu"."recruit_plan_view"
-- ----------------------------
CREATE OR REPLACE VIEW "edu"."recruit_plan_view" AS 
SELECT college_subject.length_of_schooling, co_college.college_name, batch_index.batch_name, student_classified.classified_name, subjects.subject_name, college_subject.batch_id FROM college_subject, batch_index, co_college, student_classified, subjects WHERE ((((college_subject.college_id = co_college.college_id) AND (college_subject.batch_id = batch_index.batch_id)) AND (college_subject.subeject_id = subjects.subject_id)) AND (college_subject.classified_id = student_classified.classified_id));

-- ----------------------------
-- View structure for "edu"."userrights_effective"
-- ----------------------------
CREATE OR REPLACE VIEW "edu"."userrights_effective" AS 
SELECT a.category_id, a.function_id, b.category_name, c.function_name, d.user_id FROM rights_category_function a, rights_category b, rights_function c, user_admin d WHERE (((((a.category_id)::text = (b.category_id)::text) AND ((a.function_id)::text = (c.function_id)::text)) AND (NOT (((a.category_id)::text, (a.function_id)::text) IN (SELECT rights_override.rights_category_id, rights_override.rights_function_id FROM rights_override WHERE ((rights_override.override = false) AND (rights_override.user_id = d.user_id)))))) AND ((a.category_id)::text IN (SELECT rights_default.category_id FROM rights_default WHERE (rights_default.user_type_id IN (SELECT user_admin.user_type_id FROM user_admin WHERE (user_admin.user_id = d.user_id)))))) UNION SELECT a.rights_category_id AS category_id, a.rights_function_id AS function_id, b.category_name, c.function_name, a.user_id FROM rights_override a, rights_category b, rights_function c WHERE ((((a.rights_category_id)::text = (b.category_id)::text) AND ((a.rights_function_id)::text = (c.function_id)::text)) AND (a.override = true));

-- ----------------------------
-- View structure for "edu"."userrights_view"
-- ----------------------------
CREATE OR REPLACE VIEW "edu"."userrights_view" AS 
((SELECT a.category_id, a.function_id, b.category_name, c.function_name, 'T' AS isset, d.user_id FROM rights_category_function a, rights_category b, rights_function c, user_admin d WHERE (((((a.category_id)::text = (b.category_id)::text) AND ((a.function_id)::text = (c.function_id)::text)) AND (NOT (((a.category_id)::text, (a.function_id)::text) IN (SELECT rights_override.rights_category_id, rights_override.rights_function_id FROM rights_override WHERE ((rights_override.override = false) AND (rights_override.user_id = d.user_id)))))) AND ((a.category_id)::text IN (SELECT rights_default.category_id FROM rights_default WHERE (rights_default.user_type_id IN (SELECT user_admin.user_type_id FROM user_admin WHERE (user_admin.user_id = d.user_id)))))) UNION SELECT a.category_id, a.function_id, b.category_name, c.function_name, 'F' AS isset, d.user_id FROM rights_category_function a, rights_category b, rights_function c, user_admin d WHERE (((((a.category_id)::text = (b.category_id)::text) AND ((a.function_id)::text = (c.function_id)::text)) AND (NOT (((a.category_id)::text, (a.function_id)::text) IN (SELECT rights_override.rights_category_id, rights_override.rights_function_id FROM rights_override WHERE ((rights_override.override = true) AND (rights_override.user_id = d.user_id)))))) AND (NOT ((a.category_id)::text IN (SELECT rights_default.category_id FROM rights_default WHERE (rights_default.user_type_id IN (SELECT user_admin.user_type_id FROM user_admin WHERE (user_admin.user_id = d.user_id)))))))) UNION SELECT a.rights_category_id AS category_id, a.rights_function_id AS function_id, b.category_name, c.function_name, 'T' AS isset, a.user_id FROM rights_override a, rights_category b, rights_function c WHERE ((((a.rights_category_id)::text = (b.category_id)::text) AND ((a.rights_function_id)::text = (c.function_id)::text)) AND (a.override = true))) UNION SELECT a.rights_category_id AS category_id, a.rights_function_id AS function_id, b.category_name, c.function_name, 'F' AS isset, a.user_id FROM rights_override a, rights_category b, rights_function c WHERE ((((a.rights_category_id)::text = (b.category_id)::text) AND ((a.rights_function_id)::text = (c.function_id)::text)) AND (a.override = false));

-- ----------------------------
-- View structure for "edu"."v_recruit_agent"
-- ----------------------------
CREATE OR REPLACE VIEW "edu"."v_recruit_agent" AS 
SELECT a.agent_name, b.agent_type_name, a.responsible_person, a.contact_person, a.contact_address, a.contact_phone, a.contact_mobile, a.account_name, a.bank_name, a.bank_account, a.remark, c.user_name, a.college_url FROM recruit_agent a, agent_type b, user_admin c WHERE ((a.agent_type_id = b.agent_type_id) AND (a.user_id = c.user_id));

-- ----------------------------
-- View structure for "edu"."v_student_info"
-- ----------------------------
CREATE OR REPLACE VIEW "edu"."v_student_info" AS 
SELECT a.student_name, a.identity_card, a.exam_num, a.student_address, a.student_phone, a.student_linkman, a.linkman_phone, a.student_college_id, b.college_name, c.batch_name, d.classified_name, f.subject_name, g.agent_name AS agent_owner, fa.agent_name AS fund_agent, ma.agent_name AS managed_agent, ss.stu_status_name, a.birthday, seg.ethnic_group_name, sps.pol_name, a.employer, school.school_name, a.graduate_date, a.graduate_certificate_number, a.postal_code, s_type.student_type_name, smc.student_major_category_name FROM student_info a, college_subject e, co_college b, batch_index c, student_classified d, subjects f, recruit_agent g, recruit_agent fa, recruit_agent ma, student_status ss, sd_ethnic_group seg, sd_political_status sps, sd_school school, student_type s_type, student_major_category smc WHERE (((((((((((((((((a.college_owner = e.college_id) AND (e.college_id = b.college_id)) AND (a.agent_owner = e.batch_id)) AND (e.batch_id = c.batch_id)) AND (a.classified_owner = e.classified_id)) AND (e.classified_id = d.classified_id)) AND (a.subject_owner = e.subeject_id)) AND (e.subeject_id = f.subject_id)) AND (a.agent_owner = g.agent_id)) AND (a.fund_agent = fa.agent_id)) AND (a.managed_agent = ma.agent_id)) AND (a.stu_status_id = ss.stu_status_id)) AND (a.ethnic_group_id = seg.ethnic_group_id)) AND (a.political_status_id = sps.pol_id)) AND (((a.graduate_college_id)::character varying)::text = (school.school_code)::text)) AND (a.student_type_id = s_type.student_type_id)) AND (a.major_category_id = smc.student_major_category_id));

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table "edu"."ag_return_amount"
-- ----------------------------
ALTER TABLE "edu"."ag_return_amount" ADD PRIMARY KEY ("agent_return_id");

-- ----------------------------
-- Primary Key structure for table "edu"."agent_relation"
-- ----------------------------
ALTER TABLE "edu"."agent_relation" ADD PRIMARY KEY ("agent_id", "refer_agent");

-- ----------------------------
-- Primary Key structure for table "edu"."agent_return"
-- ----------------------------
ALTER TABLE "edu"."agent_return" ADD PRIMARY KEY ("agent_id", "ag_return_type_id", "batch_id");

-- ----------------------------
-- Uniques structure for table "edu"."agent_return_type"
-- ----------------------------
ALTER TABLE "edu"."agent_return_type" ADD UNIQUE ("aggregation_desc");

-- ----------------------------
-- Primary Key structure for table "edu"."agent_return_type"
-- ----------------------------
ALTER TABLE "edu"."agent_return_type" ADD PRIMARY KEY ("ag_return_type_id");

-- ----------------------------
-- Primary Key structure for table "edu"."agent_type"
-- ----------------------------
ALTER TABLE "edu"."agent_type" ADD PRIMARY KEY ("agent_type_id");

-- ----------------------------
-- Primary Key structure for table "edu"."agree_return"
-- ----------------------------
ALTER TABLE "edu"."agree_return" ADD PRIMARY KEY ("agree_return_id");

-- ----------------------------
-- Primary Key structure for table "edu"."bank_account"
-- ----------------------------
ALTER TABLE "edu"."bank_account" ADD PRIMARY KEY ("agent_id", "college_id", "batch_id");

-- ----------------------------
-- Primary Key structure for table "edu"."bank_order"
-- ----------------------------
ALTER TABLE "edu"."bank_order" ADD PRIMARY KEY ("order_id", "charge_id");

-- ----------------------------
-- Primary Key structure for table "edu"."batch_index"
-- ----------------------------
ALTER TABLE "edu"."batch_index" ADD PRIMARY KEY ("batch_id");

-- ----------------------------
-- Primary Key structure for table "edu"."charge_admin"
-- ----------------------------
ALTER TABLE "edu"."charge_admin" ADD PRIMARY KEY ("charge_id");

-- ----------------------------
-- Primary Key structure for table "edu"."charge_type"
-- ----------------------------
ALTER TABLE "edu"."charge_type" ADD PRIMARY KEY ("charge_type_id");

-- ----------------------------
-- Primary Key structure for table "edu"."co_college"
-- ----------------------------
ALTER TABLE "edu"."co_college" ADD PRIMARY KEY ("college_id");

-- ----------------------------
-- Primary Key structure for table "edu"."college_aggregation"
-- ----------------------------
ALTER TABLE "edu"."college_aggregation" ADD PRIMARY KEY ("ag_return_type_id", "college_id", "headcount");

-- ----------------------------
-- Primary Key structure for table "edu"."college_agreement"
-- ----------------------------
ALTER TABLE "edu"."college_agreement" ADD PRIMARY KEY ("agreement_id");

-- ----------------------------
-- Primary Key structure for table "edu"."college_return"
-- ----------------------------
ALTER TABLE "edu"."college_return" ADD PRIMARY KEY ("agreement_id", "headcount", "batch_id");

-- ----------------------------
-- Primary Key structure for table "edu"."college_subject"
-- ----------------------------
ALTER TABLE "edu"."college_subject" ADD PRIMARY KEY ("college_id", "batch_id", "classified_id", "subeject_id");

-- ----------------------------
-- Triggers structure for table "edu"."current_batch"
-- ----------------------------
CREATE TRIGGER "update_current_batch_update_date" AFTER INSERT OR UPDATE ON "edu"."current_batch"
FOR EACH ROW
EXECUTE PROCEDURE "update_current_batch_update_date"();

-- ----------------------------
-- Primary Key structure for table "edu"."current_batch"
-- ----------------------------
ALTER TABLE "edu"."current_batch" ADD PRIMARY KEY ("current_batch_id");

-- ----------------------------
-- Primary Key structure for table "edu"."derate_request"
-- ----------------------------
ALTER TABLE "edu"."derate_request" ADD PRIMARY KEY ("derate_id");

-- ----------------------------
-- Primary Key structure for table "edu"."entrance_cost"
-- ----------------------------
ALTER TABLE "edu"."entrance_cost" ADD PRIMARY KEY ("college_id", "batch_id", "agent_id", "subject_id", "fee_id", "classified_id");

-- ----------------------------
-- Primary Key structure for table "edu"."fee_type"
-- ----------------------------
ALTER TABLE "edu"."fee_type" ADD PRIMARY KEY ("fee_id");

-- ----------------------------
-- Primary Key structure for table "edu"."messages"
-- ----------------------------
ALTER TABLE "edu"."messages" ADD PRIMARY KEY ("message_id");

-- ----------------------------
-- Primary Key structure for table "edu"."pic_type"
-- ----------------------------
ALTER TABLE "edu"."pic_type" ADD PRIMARY KEY ("pic_type_id");

-- ----------------------------
-- Primary Key structure for table "edu"."recruit_agent"
-- ----------------------------
ALTER TABLE "edu"."recruit_agent" ADD PRIMARY KEY ("agent_id");

-- ----------------------------
-- Primary Key structure for table "edu"."refundment_admin"
-- ----------------------------
ALTER TABLE "edu"."refundment_admin" ADD PRIMARY KEY ("refund_id");

-- ----------------------------
-- Primary Key structure for table "edu"."rights_category"
-- ----------------------------
ALTER TABLE "edu"."rights_category" ADD PRIMARY KEY ("category_id");

-- ----------------------------
-- Primary Key structure for table "edu"."rights_category_function"
-- ----------------------------
ALTER TABLE "edu"."rights_category_function" ADD PRIMARY KEY ("category_id", "function_id");

-- ----------------------------
-- Primary Key structure for table "edu"."rights_default"
-- ----------------------------
ALTER TABLE "edu"."rights_default" ADD PRIMARY KEY ("user_type_id", "category_id");

-- ----------------------------
-- Primary Key structure for table "edu"."rights_function"
-- ----------------------------
ALTER TABLE "edu"."rights_function" ADD PRIMARY KEY ("function_id");

-- ----------------------------
-- Primary Key structure for table "edu"."rights_override"
-- ----------------------------
ALTER TABLE "edu"."rights_override" ADD PRIMARY KEY ("user_id", "rights_category_id", "rights_function_id");

-- ----------------------------
-- Primary Key structure for table "edu"."sd_ethnic_group"
-- ----------------------------
ALTER TABLE "edu"."sd_ethnic_group" ADD PRIMARY KEY ("ethnic_group_id");

-- ----------------------------
-- Primary Key structure for table "edu"."sd_political_status"
-- ----------------------------
ALTER TABLE "edu"."sd_political_status" ADD PRIMARY KEY ("pol_id");

-- ----------------------------
-- Indexes structure for table sd_school
-- ----------------------------
CREATE UNIQUE INDEX "idx_school_code" ON "edu"."sd_school" USING btree ("school_code");

-- ----------------------------
-- Primary Key structure for table "edu"."sd_school"
-- ----------------------------
ALTER TABLE "edu"."sd_school" ADD PRIMARY KEY ("school_code");

-- ----------------------------
-- Primary Key structure for table "edu"."sd_zzu_major"
-- ----------------------------
ALTER TABLE "edu"."sd_zzu_major" ADD PRIMARY KEY ("majorid");

-- ----------------------------
-- Primary Key structure for table "edu"."student_change"
-- ----------------------------
ALTER TABLE "edu"."student_change" ADD PRIMARY KEY ("change_id");

-- ----------------------------
-- Primary Key structure for table "edu"."student_classified"
-- ----------------------------
ALTER TABLE "edu"."student_classified" ADD PRIMARY KEY ("classified_id");

-- ----------------------------
-- Primary Key structure for table "edu"."student_info"
-- ----------------------------
ALTER TABLE "edu"."student_info" ADD PRIMARY KEY ("student_id");

-- ----------------------------
-- Primary Key structure for table "edu"."student_major_category"
-- ----------------------------
ALTER TABLE "edu"."student_major_category" ADD PRIMARY KEY ("student_major_category_id");

-- ----------------------------
-- Primary Key structure for table "edu"."student_pic"
-- ----------------------------
ALTER TABLE "edu"."student_pic" ADD PRIMARY KEY ("student_id", "pic_type_id");

-- ----------------------------
-- Primary Key structure for table "edu"."student_status"
-- ----------------------------
ALTER TABLE "edu"."student_status" ADD PRIMARY KEY ("stu_status_id");

-- ----------------------------
-- Primary Key structure for table "edu"."student_type"
-- ----------------------------
ALTER TABLE "edu"."student_type" ADD PRIMARY KEY ("student_type_id");

-- ----------------------------
-- Primary Key structure for table "edu"."subjects"
-- ----------------------------
ALTER TABLE "edu"."subjects" ADD PRIMARY KEY ("subject_id");

-- ----------------------------
-- Primary Key structure for table "edu"."table_sequence"
-- ----------------------------
ALTER TABLE "edu"."table_sequence" ADD PRIMARY KEY ("table_name");

-- ----------------------------
-- Primary Key structure for table "edu"."user_admin"
-- ----------------------------
ALTER TABLE "edu"."user_admin" ADD PRIMARY KEY ("user_id");

-- ----------------------------
-- Primary Key structure for table "edu"."user_type"
-- ----------------------------
ALTER TABLE "edu"."user_type" ADD PRIMARY KEY ("user_type_id");

-- ----------------------------
-- Foreign Key structure for table "edu"."ag_return_amount"
-- ----------------------------
ALTER TABLE "edu"."ag_return_amount" ADD FOREIGN KEY ("batch_id") REFERENCES "edu"."batch_index" ("batch_id") ON DELETE CASCADE ON UPDATE NO ACTION;
ALTER TABLE "edu"."ag_return_amount" ADD FOREIGN KEY ("fee_id") REFERENCES "edu"."fee_type" ("fee_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "edu"."agent_return"
-- ----------------------------
ALTER TABLE "edu"."agent_return" ADD FOREIGN KEY ("agent_id") REFERENCES "edu"."recruit_agent" ("agent_id") ON DELETE CASCADE ON UPDATE NO ACTION;
ALTER TABLE "edu"."agent_return" ADD FOREIGN KEY ("ag_return_type_id") REFERENCES "edu"."agent_return_type" ("ag_return_type_id") ON DELETE CASCADE ON UPDATE NO ACTION;
ALTER TABLE "edu"."agent_return" ADD FOREIGN KEY ("batch_id") REFERENCES "edu"."batch_index" ("batch_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "edu"."agent_return_type"
-- ----------------------------
ALTER TABLE "edu"."agent_return_type" ADD FOREIGN KEY ("fee_id") REFERENCES "edu"."fee_type" ("fee_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "edu"."bank_account"
-- ----------------------------
ALTER TABLE "edu"."bank_account" ADD FOREIGN KEY ("batch_id") REFERENCES "edu"."batch_index" ("batch_id") ON DELETE CASCADE ON UPDATE NO ACTION;
ALTER TABLE "edu"."bank_account" ADD FOREIGN KEY ("college_id") REFERENCES "edu"."co_college" ("college_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "edu"."bank_order"
-- ----------------------------
ALTER TABLE "edu"."bank_order" ADD FOREIGN KEY ("charge_id") REFERENCES "edu"."charge_admin" ("charge_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "edu"."college_aggregation"
-- ----------------------------
ALTER TABLE "edu"."college_aggregation" ADD FOREIGN KEY ("college_id") REFERENCES "edu"."co_college" ("college_id") ON DELETE CASCADE ON UPDATE NO ACTION;
ALTER TABLE "edu"."college_aggregation" ADD FOREIGN KEY ("ag_return_type_id") REFERENCES "edu"."agent_return_type" ("ag_return_type_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "edu"."college_agreement"
-- ----------------------------
ALTER TABLE "edu"."college_agreement" ADD FOREIGN KEY ("college_id") REFERENCES "edu"."co_college" ("college_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "edu"."college_return"
-- ----------------------------
ALTER TABLE "edu"."college_return" ADD FOREIGN KEY ("fee_id") REFERENCES "edu"."fee_type" ("fee_id") ON DELETE CASCADE ON UPDATE NO ACTION;
ALTER TABLE "edu"."college_return" ADD FOREIGN KEY ("batch_id") REFERENCES "edu"."batch_index" ("batch_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "edu"."college_subject"
-- ----------------------------
ALTER TABLE "edu"."college_subject" ADD FOREIGN KEY ("classified_id") REFERENCES "edu"."student_classified" ("classified_id") ON DELETE CASCADE ON UPDATE NO ACTION;
ALTER TABLE "edu"."college_subject" ADD FOREIGN KEY ("batch_id") REFERENCES "edu"."batch_index" ("batch_id") ON DELETE CASCADE ON UPDATE NO ACTION;
ALTER TABLE "edu"."college_subject" ADD FOREIGN KEY ("subeject_id") REFERENCES "edu"."subjects" ("subject_id") ON DELETE CASCADE ON UPDATE NO ACTION;
ALTER TABLE "edu"."college_subject" ADD FOREIGN KEY ("college_id") REFERENCES "edu"."co_college" ("college_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "edu"."entrance_cost"
-- ----------------------------
ALTER TABLE "edu"."entrance_cost" ADD FOREIGN KEY ("college_id") REFERENCES "edu"."co_college" ("college_id") ON DELETE CASCADE ON UPDATE NO ACTION;
ALTER TABLE "edu"."entrance_cost" ADD FOREIGN KEY ("classified_id") REFERENCES "edu"."student_classified" ("classified_id") ON DELETE CASCADE ON UPDATE NO ACTION;
ALTER TABLE "edu"."entrance_cost" ADD FOREIGN KEY ("batch_id") REFERENCES "edu"."batch_index" ("batch_id") ON DELETE CASCADE ON UPDATE NO ACTION;
ALTER TABLE "edu"."entrance_cost" ADD FOREIGN KEY ("subject_id") REFERENCES "edu"."subjects" ("subject_id") ON DELETE CASCADE ON UPDATE NO ACTION;
ALTER TABLE "edu"."entrance_cost" ADD FOREIGN KEY ("fee_id") REFERENCES "edu"."fee_type" ("fee_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "edu"."recruit_agent"
-- ----------------------------
ALTER TABLE "edu"."recruit_agent" ADD FOREIGN KEY ("agent_type_id") REFERENCES "edu"."agent_type" ("agent_type_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "edu"."rights_default"
-- ----------------------------
ALTER TABLE "edu"."rights_default" ADD FOREIGN KEY ("user_type_id") REFERENCES "edu"."user_type" ("user_type_id") ON DELETE CASCADE ON UPDATE NO ACTION;
ALTER TABLE "edu"."rights_default" ADD FOREIGN KEY ("category_id") REFERENCES "edu"."rights_category" ("category_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "edu"."student_info"
-- ----------------------------
ALTER TABLE "edu"."student_info" ADD FOREIGN KEY ("subject_owner") REFERENCES "edu"."subjects" ("subject_id") ON DELETE CASCADE ON UPDATE NO ACTION;
ALTER TABLE "edu"."student_info" ADD FOREIGN KEY ("college_owner") REFERENCES "edu"."co_college" ("college_id") ON DELETE CASCADE ON UPDATE NO ACTION;
ALTER TABLE "edu"."student_info" ADD FOREIGN KEY ("batch_owner") REFERENCES "edu"."batch_index" ("batch_id") ON DELETE CASCADE ON UPDATE NO ACTION;
ALTER TABLE "edu"."student_info" ADD FOREIGN KEY ("student_type_id") REFERENCES "edu"."student_type" ("student_type_id") ON DELETE CASCADE ON UPDATE NO ACTION;
ALTER TABLE "edu"."student_info" ADD FOREIGN KEY ("major_category_id") REFERENCES "edu"."student_major_category" ("student_major_category_id") ON DELETE CASCADE ON UPDATE NO ACTION;
ALTER TABLE "edu"."student_info" ADD FOREIGN KEY ("classified_owner") REFERENCES "edu"."student_classified" ("classified_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "edu"."student_pic"
-- ----------------------------
ALTER TABLE "edu"."student_pic" ADD FOREIGN KEY ("pic_type_id") REFERENCES "edu"."pic_type" ("pic_type_id") ON DELETE NO ACTION ON UPDATE NO ACTION;

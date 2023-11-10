console.log(([][
	[]
] + [])[+!![]] + ([] + {})[+!![] + +!![]])

var time = "2021年2月";

var parts = time.split("年");
var year = parseInt(parts[0]);
var month = parseInt(parts[1]);

var daysInMonth = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

if ((year % 4 === 0 && year % 100 !== 0) || year % 400 === 0) {
	daysInMonth[1] = 29;
}

var days = daysInMonth[month - 1];

console.log("当月的天数为：" + days);

function weightedLottery(weights) {
	// 计算权重总和
	const totalWeight = weights.reduce((sum, weight) => sum + weight, 0);

	// 计算权重累积值列表
	const cumulativeWeights = [0];
	for (let i = 0; i < weights.length; i++) {
		cumulativeWeights.push(cumulativeWeights[i] + weights[i]);
	}

	// 生成一个随机数
	const randomNum = Math.random() * totalWeight;

	// 根据随机数找到对应的奖品
	for (let i = 0; i < cumulativeWeights.length - 1; i++) {
		if (cumulativeWeights[i] <= randomNum && randomNum < cumulativeWeights[i + 1]) {
			return i;
		}
	}

	// 如果无法找到奖品，则返回 null
	return null;
}

// 定义奖品及其对应的权重
const prizes = ['奖品A', '奖品B', '奖品C'];
const weights = [3, 2, 5];

// 模拟抽奖过程
const numTrials = 10;
for (let i = 0; i < numTrials; i++) {
	const result = weightedLottery(weights);
	if (result !== null) {
		console.log("恭喜你获得了：", prizes[result]);
	} else {
		console.log("很遗憾，没有中奖");
	}
}

function countChars(str) {
	const countMap = new Map();
	for (let char of str) {
		if (countMap.has(char)) {
			countMap.set(char, countMap.get(char) + 1);
		} else {
			countMap.set(char, 1);
		}
	}
	return countMap;
}

console.log(countChars("hello world"));

for (let i = 2; i >= 1; i--) { // 控制行数
	let spaces = " ".repeat(i - 1); // 空格数量
	let hearts = "♥ ".repeat(6 - i); // ♥ 数量
	console.log(`${spaces}${hearts}`);
}
for (let i = 2; i <= 5; i++) { // 控制行数
	let spaces = " ".repeat(i - 1); // 空格数量
	let hearts = "♥ ".repeat(6 - i); // ♥ 数量
	console.log(`${spaces}${hearts}`);
}

console.log(`${"♥ ".repeat(2)}`); // 空格数量


var a = "243624623464",
	b = "3463";
var Aa = Array.from(a),
	Ab = Array.from(b);
var la = a.length,
	lb = b.length;

if (la > lb) {
	// str2 = '0'.repeat(len1 - len2) + str2;
	b = '0'.repeat(la - lb) + b;
} else if (la < lb) {
	a = '0'.repeat(lb - la) + a;
}
console.log(a + "  " + b);

for (var i = 0; i < la; i++) {
	la
}


let _time10 = Array.from(Array(10)).map((_, i) => i);
console.log(_time10);

_time10 = Array.from(Array(10)).map((n, i) => {
	// 使用 n 进行计算或逻辑处理
	console.log(n);
	return i;
});

// 定义树的结点类
class TreeNode {
	constructor(val) {
		this.val = val; // 结点值
		this.children = []; // 子结点数组
		this.isYellow = false; // 是否为黄色结点
	}
}

// 构建树
function buildTree(n, edges) {
	const nodes = new Array(n + 1); // 结点数组，索引对应结点编号
	for (let i = 1; i <= n; i++) {
		nodes[i] = new TreeNode(i);
	}
	for (const [x, y] of edges) {
		nodes[x].children.push(nodes[y]);
	}
	return nodes[1]; // 返回根结点
}

// 染色并变黄
function colorAndTurnYellow(root, x) {
	dfs(root, 1, x);
}

// DFS 遍历树，并染色
function dfs(node, depth, x) {
	if (depth >= x) {
		node.isYellow = true;
	}
	for (const child of node.children) {
		dfs(child, depth + 1, x);
	}
}

// 查询子树中的黄色结点数量
function countYellowNodes(root, x) {
	let count = 0;
	dfsCount(root, x, count);
	return count;
}

// DFS 遍历子树，统计黄色结点数量
function dfsCount(node, x, count) {
	if (node.isYellow) {
		count++;
	}
	for (const child of node.children) {
		dfsCount(child, x, count);
	}
}

// 处理输入
function handleInput(n, m, edges, queries) {
	const root = buildTree(n, edges);
	const results = [];
	for (const [op, x] of queries) {
		if (op === 1) {
			colorAndTurnYellow(root, x);
		} else {
			const yellowCount = countYellowNodes(root, x);
			results.push(yellowCount);
		}
	}
	return results;
}

// 示例输入
const n = 5;
const m = 4;
const edges = [
	[1, 2],
	[1, 3],
	[2, 4],
	[2, 5]
];
const queries = [
	[1, 2],
	[2, 1],
	[1, 4],
	[2, 3]
];

// 处理输入并输出结果
const results = handleInput(n, m, edges, queries);
for (const result of results) {
	console.log(result);
}


var perm = {
	read: 0b001,
	write: 0b010,
	create: 0b100
};
var p = perm.read | perm.create; //为 p 元素 添加 read 和 create属性
p = p ^ perm.create; //移除 create 属性
p & perm.read === perm.create ? console.log("可读") : console.log("不可读");

/*var shuzi1 = '89026582437856';
var shuzi2 = '582437';
console.log(calcY(shuzi1, shuzi2));

function calcY(a, b) {
	const len = Math.max(a.length, a.length);
	var result=0;
	a = a.padStart(len, '0');
	b = b.padStart(len, '0');
	let carry = 0;
	for (var i = len - 1; i >= 0; i--) {
		let n = +a[i] + +b[i] + carry;
		carry = Math.floor(n / 10);
		results = (n % 10) + results;
	}
	if (carry)
		results = '1' + results;

	return results;
}*/
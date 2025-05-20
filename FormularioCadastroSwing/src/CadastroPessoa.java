import java.awt.*;
import javax.swing.*;

public class CadastroPessoa extends JFrame {

    public CadastroPessoa() {
        setTitle("Cadastro de Pessoa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);

        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Título
        JLabel titulo = new JLabel("Cadastro de Pessoa");
        titulo.setFont(new Font("Arial", Font.PLAIN, 36));
        titulo.setForeground(new Color(255, 102, 0));
        titulo.setAlignmentX(Component.LEFT_ALIGNMENT);
        painelPrincipal.add(titulo);
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 20)));

        // Painel do formulário
        JPanel form = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Aumenta o espaço ao redor dos componentes
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.weightx = 1.0; // Distribui o espaço horizontal uniformemente

        // Linha 1: Tipo, CPF/CNPJ, número, fornecedor
        gbc.gridy = 0;

        gbc.gridx = 0;
        form.add(new JLabel("Tipo"), gbc);

        gbc.gridx = 1;
        form.add(new JComboBox<>(new String[]{"Física", "Jurídica"}), gbc);

        gbc.gridx = 2;
        form.add(new JComboBox<>(new String[]{"CPF", "CNPJ"}), gbc);

        gbc.gridx = 3;
        form.add(new JTextField(10), gbc);

        gbc.gridx = 4;
        JTextField fornecedorPlaceholder = new JTextField();
        fornecedorPlaceholder.setColumns(10);
        form.add(fornecedorPlaceholder, gbc);

        gbc.gridx = 5;
        JCheckBox fornecedorCheck = new JCheckBox();
        form.add(fornecedorCheck, gbc);

        // Linha 2: Nome
        gbc.gridy++;
        gbc.gridx = 0;
        form.add(new JLabel("Nome"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 4;
        form.add(new JTextField(30), gbc);
        gbc.gridwidth = 1;

        // Linha 3: RG, Órgão Expedidor
        gbc.gridy++;
        gbc.gridx = 0;
        form.add(new JLabel("RG / Inscrição Estadual"), gbc);

        gbc.gridx = 1;
        form.add(new JTextField(15), gbc);

        gbc.gridx = 2;
        form.add(new JLabel("Órgão Expedidor"), gbc);

        gbc.gridx = 3;
        form.add(new JTextField(15), gbc);

        // Linha 4: Email, CEP
        gbc.gridy++;
        gbc.gridx = 0;
        form.add(new JLabel("Email"), gbc);

        gbc.gridx = 1;
        form.add(new JTextField(15), gbc);

        gbc.gridx = 2;
        form.add(new JLabel("CEP"), gbc);

        gbc.gridx = 3;
        form.add(new JTextField(10), gbc);

        // Linha 5: País, UF
        gbc.gridy++;
        gbc.gridx = 0;
        form.add(new JLabel("País"), gbc);

        gbc.gridx = 1;
        form.add(new JLabel("BRASIL"), gbc);

        gbc.gridx = 2;
        form.add(new JLabel("UF"), gbc);

        gbc.gridx = 3;
        form.add(new JTextField(5), gbc);

        // Linha 6: Município
        gbc.gridy++;
        gbc.gridx = 0;
        form.add(new JLabel("Município"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 4;
        form.add(new JTextField(30), gbc);
        gbc.gridwidth = 1;

        // Linha 7: Logradouro
        gbc.gridy++;
        gbc.gridx = 0;
        form.add(new JLabel("Logradouro"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 4;
        form.add(new JTextField(30), gbc);
        gbc.gridwidth = 1;

        // Linha 8: Número, Complemento
        gbc.gridy++;
        gbc.gridx = 0;
        form.add(new JLabel("Número"), gbc);

        gbc.gridx = 1;
        form.add(new JTextField(10), gbc);

        gbc.gridx = 2;
        form.add(new JLabel("Complemento"), gbc);

        gbc.gridx = 3;
        form.add(new JTextField(15), gbc);

        // Linha 9: Bairro, Telefone
        gbc.gridy++;
        gbc.gridx = 0;
        form.add(new JLabel("Bairro"), gbc);

        gbc.gridx = 1;
        form.add(new JTextField(15), gbc);

        gbc.gridx = 2;
        form.add(new JLabel("Telefone"), gbc);

        gbc.gridx = 3;
        form.add(new JTextField(15), gbc);

        // Linha 10: Situação
        gbc.gridy++;
        gbc.gridx = 0;
        form.add(new JLabel("Situação"), gbc);

        gbc.gridx = 1;
        form.add(new JRadioButton("Ativo", true), gbc);

        gbc.gridx = 2;
        form.add(new JRadioButton("Inativo"), gbc);

        form.setAlignmentX(Component.LEFT_ALIGNMENT); // Alinha o painel do formulário à esquerda
        painelPrincipal.add(form);

        // Botões
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 20)));
        JPanel botoes = new JPanel(new FlowLayout(FlowLayout.LEFT));
        botoes.setAlignmentX(Component.LEFT_ALIGNMENT); // Alinha o painel de botões à esquerda

        JButton confirmar = new JButton("Confirmar");
        confirmar.setBackground(new Color(255, 153, 0));
        confirmar.setForeground(Color.WHITE);

        JButton excluir = new JButton("Excluir");
        excluir.setBackground(new Color(255, 102, 0));
        excluir.setForeground(Color.WHITE);

        JButton limpar = new JButton("Limpar");
 
        botoes.add(confirmar);
        botoes.add(excluir);
        botoes.add(limpar);

        painelPrincipal.add(botoes);
        add(painelPrincipal);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CadastroPessoa();
    }
}

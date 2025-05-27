import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class CadastroPessoa extends JFrame {

    public CadastroPessoa() {
        setTitle("Cadastro de Pessoa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 700);
        setLocationRelativeTo(null);

        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Título
        JLabel titulo = new JLabel("Cadastro de Pessoa");
        titulo.setFont(new Font("Sans-serif", Font.PLAIN, 36));
        titulo.setForeground(new Color(255, 102, 0));
        titulo.setAlignmentX(Component.LEFT_ALIGNMENT);
        painelPrincipal.add(titulo);
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 20)));

        JPanel form = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        form.setAlignmentX(Component.LEFT_ALIGNMENT);
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        JLabel tipoLabel = new JLabel("Tipo");
        tipoLabel.setBorder(new LineBorder(Color.GRAY, 1));
        tipoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        tipoLabel.setBackground(Color.WHITE);
        tipoLabel.setOpaque(true);
        form.add(tipoLabel, gbc);

        gbc.gridx = 1;
        JComboBox<String> tipoComboBox = new JComboBox<>(new String[]{"Física", "Jurídica"});
        form.add(tipoComboBox, gbc);

        gbc.gridx = 2;
        JLabel cpfLabel = new JLabel("CPF / CNPJ");
        cpfLabel.setBorder(new LineBorder(Color.GRAY, 1));
        cpfLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cpfLabel.setBackground(Color.WHITE);
        cpfLabel.setOpaque(true);
        form.add(cpfLabel, gbc);

        gbc.gridx = 3;
        JTextField cpfTextField = new JTextField(15);
        form.add(cpfTextField, gbc);

        gbc.gridx = 4;
        JLabel fornecedorLabel = new JLabel("Fornecedor");
        fornecedorLabel.setBorder(new LineBorder(Color.GRAY, 1));
        fornecedorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        fornecedorLabel.setBackground(Color.WHITE);
        fornecedorLabel.setOpaque(true);
        form.add(fornecedorLabel, gbc);

        gbc.gridx = 5;
        JCheckBox fornecedorCheck = new JCheckBox();
        form.add(fornecedorCheck, gbc);

        gbc.gridy++;
        gbc.gridx = 0;
        JLabel nomeLabel = new JLabel("Nome");
        nomeLabel.setBorder(new LineBorder(Color.GRAY, 1));
        nomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nomeLabel.setBackground(Color.WHITE);
        nomeLabel.setOpaque(true);
        form.add(nomeLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 5;
        JTextField nomeTextField = new JTextField(50);
        form.add(nomeTextField, gbc);
        gbc.gridwidth = 1;

        gbc.gridy++;
        gbc.gridx = 0;
        JLabel rgLabel = new JLabel("RG / Inscrição Estadual");
        rgLabel.setBorder(new LineBorder(Color.GRAY, 1));
        rgLabel.setForeground(new Color(150, 150, 150));
        rgLabel.setHorizontalAlignment(SwingConstants.CENTER);
        rgLabel.setBackground(Color.WHITE);
        rgLabel.setOpaque(true);
        form.add(rgLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        JTextField rgTextField = new JTextField(20);
        form.add(rgTextField, gbc);
        gbc.gridwidth = 1;

        gbc.gridx = 3;
        JLabel oeLabel = new JLabel("Órgão Expedidor");
        oeLabel.setBorder(new LineBorder(Color.GRAY, 1));
        oeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        oeLabel.setBackground(Color.WHITE);
        oeLabel.setOpaque(true);
        form.add(oeLabel, gbc);

        gbc.gridx = 4;
        gbc.gridwidth = 2;
        JTextField oeTextField = new JTextField(20);
        form.add(oeTextField, gbc);
        gbc.gridwidth = 1;

        gbc.gridy++;
        gbc.gridx = 0;
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBorder(new LineBorder(Color.GRAY, 1));
        emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
        emailLabel.setBackground(Color.WHITE);
        emailLabel.setOpaque(true);
        form.add(emailLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        JTextField emailTextField = new JTextField(20);
        form.add(emailTextField, gbc);
        gbc.gridwidth = 1;

        gbc.gridx = 3;
        JLabel cepLabel = new JLabel("CEP");
        cepLabel.setBorder(new LineBorder(Color.GRAY, 1));
        cepLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cepLabel.setBackground(Color.WHITE);
        cepLabel.setOpaque(true);
        form.add(cepLabel, gbc);

        gbc.gridx = 4;
        gbc.gridwidth = 2;
        JTextField cepTextField = new JTextField(20);
        form.add(cepTextField, gbc);
        gbc.gridwidth = 1;

        gbc.gridy++;
        gbc.gridx = 0;
        JLabel paisLabel = new JLabel("País");
        paisLabel.setBorder(new LineBorder(Color.GRAY, 1));
        paisLabel.setHorizontalAlignment(SwingConstants.CENTER);
        paisLabel.setBackground(Color.WHITE);
        paisLabel.setOpaque(true);
        form.add(paisLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        JLabel brasilLabel = new JLabel("BRASIL");
        brasilLabel.setBackground(new Color(200, 200, 200));
        brasilLabel.setOpaque(true);
        brasilLabel.setHorizontalAlignment(SwingConstants.LEFT);
        brasilLabel.setBorder(new LineBorder(Color.GRAY, 1));
        form.add(brasilLabel, gbc);
        gbc.gridwidth = 1;

        gbc.gridx = 3;
        JLabel ufLabel = new JLabel("UF");
        ufLabel.setBorder(new LineBorder(Color.GRAY, 1));
        ufLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ufLabel.setBackground(Color.WHITE);
        ufLabel.setOpaque(true);
        form.add(ufLabel, gbc);

        gbc.gridx = 4;
        gbc.gridwidth = 2;
        JTextField ufTextField = new JTextField(20);
        form.add(ufTextField, gbc);
        gbc.gridwidth = 1;

        gbc.gridy++;
        gbc.gridx = 0;
        JLabel municipioLabel = new JLabel("Município");
        municipioLabel.setBorder(new LineBorder(Color.GRAY, 1));
        municipioLabel.setHorizontalAlignment(SwingConstants.CENTER);
        municipioLabel.setBackground(Color.WHITE);
        municipioLabel.setOpaque(true);
        form.add(municipioLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 5;
        JTextField municipioTextField = new JTextField(50);
        form.add(municipioTextField, gbc);
        gbc.gridwidth = 1;

        gbc.gridy++;
        gbc.gridx = 0;
        JLabel logradouroLabel = new JLabel("Logradouro");
        logradouroLabel.setBorder(new LineBorder(Color.GRAY, 1));
        logradouroLabel.setHorizontalAlignment(SwingConstants.CENTER);
        logradouroLabel.setBackground(Color.WHITE);
        logradouroLabel.setOpaque(true);
        form.add(logradouroLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 5;
        JTextField logradouroTextField = new JTextField(50);
        form.add(logradouroTextField, gbc);
        gbc.gridwidth = 1;

        gbc.gridy++;
        gbc.gridx = 0;
        JLabel numeroLabel = new JLabel("Número");
        numeroLabel.setBorder(new LineBorder(Color.GRAY, 1));
        numeroLabel.setHorizontalAlignment(SwingConstants.CENTER);
        numeroLabel.setBackground(Color.WHITE);
        numeroLabel.setOpaque(true);
        form.add(numeroLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        JTextField numeroTextField = new JTextField(20);
        form.add(numeroTextField, gbc);
        gbc.gridwidth = 1;

        gbc.gridx = 3;
        JLabel complementoLabel = new JLabel("Complemento");
        complementoLabel.setBorder(new LineBorder(Color.GRAY, 1));
        complementoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        complementoLabel.setBackground(Color.WHITE);
        complementoLabel.setOpaque(true);
        form.add(complementoLabel, gbc);

        gbc.gridx = 4;
        gbc.gridwidth = 2;
        JTextField complementoTextField = new JTextField(20);
        form.add(complementoTextField, gbc);
        gbc.gridwidth = 1;

        gbc.gridy++;
        gbc.gridx = 0;
        JLabel bairroLabel = new JLabel("Bairro");
        bairroLabel.setBorder(new LineBorder(Color.GRAY, 1));
        bairroLabel.setHorizontalAlignment(SwingConstants.CENTER);
        bairroLabel.setBackground(Color.WHITE);
        bairroLabel.setOpaque(true);
        form.add(bairroLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        JTextField bairroTextField = new JTextField(20);
        form.add(bairroTextField, gbc);
        gbc.gridwidth = 1;

        gbc.gridx = 3;
        JLabel telefoneLabel = new JLabel("Telefone");
        telefoneLabel.setBorder(new LineBorder(Color.GRAY, 1));
        telefoneLabel.setHorizontalAlignment(SwingConstants.CENTER);
        telefoneLabel.setBackground(Color.WHITE);
        telefoneLabel.setOpaque(true);
        form.add(telefoneLabel, gbc);

        gbc.gridx = 4;
        gbc.gridwidth = 2;
        JTextField telefoneTextField = new JTextField(20);
        form.add(telefoneTextField, gbc);
        gbc.gridwidth = 1;

        gbc.gridy++;
        gbc.gridx = 0;
        JLabel situacaoLabel = new JLabel("Situação");
        situacaoLabel.setBorder(new LineBorder(Color.GRAY, 1));
        situacaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        situacaoLabel.setBackground(Color.WHITE);
        situacaoLabel.setOpaque(true);
        form.add(situacaoLabel, gbc);

        gbc.gridx = 1;
        JRadioButton ativoRadio = new JRadioButton("Ativo", true);
        form.add(ativoRadio, gbc);

        gbc.gridx = 2;
        JRadioButton inativoRadio = new JRadioButton("Inativo");
        form.add(inativoRadio, gbc);

        ButtonGroup situacaoGroup = new ButtonGroup();
        situacaoGroup.add(ativoRadio);
        situacaoGroup.add(inativoRadio);

        form.setAlignmentX(Component.LEFT_ALIGNMENT);
        painelPrincipal.add(form);

        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 20)));
        JPanel botoes = new JPanel(new FlowLayout(FlowLayout.LEFT));
        botoes.setAlignmentX(Component.LEFT_ALIGNMENT);

        JButton confirmar = new JButton("Confirmar");
        confirmar.setBackground(new Color(255, 102, 0));
        confirmar.setForeground(Color.WHITE);

        JButton excluir = new JButton("Excluir");
        excluir.setBackground(new Color(255, 102, 0));
        excluir.setForeground(Color.WHITE);
        excluir.setFocusPainted(false);

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

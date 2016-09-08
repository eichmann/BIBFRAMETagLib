package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicProviderStatement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicProviderStatement currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicProviderStatement.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicProviderStatementIterator theElectronic = (ElectronicProviderStatementIterator)findAncestorWithClass(this, ElectronicProviderStatementIterator.class);
			pageContext.getOut().print(theElectronic.getProviderStatement());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for providerStatement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for providerStatement tag ");
		}
		return SKIP_BODY;
	}
}


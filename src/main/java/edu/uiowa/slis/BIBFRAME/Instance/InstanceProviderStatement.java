package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceProviderStatement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceProviderStatement currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceProviderStatement.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceProviderStatementIterator theInstance = (InstanceProviderStatementIterator)findAncestorWithClass(this, InstanceProviderStatementIterator.class);
			pageContext.getOut().print(theInstance.getProviderStatement());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for providerStatement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for providerStatement tag ");
		}
		return SKIP_BODY;
	}
}


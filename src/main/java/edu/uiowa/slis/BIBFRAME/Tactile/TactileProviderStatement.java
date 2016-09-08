package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileProviderStatement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileProviderStatement currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileProviderStatement.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TactileProviderStatementIterator theTactile = (TactileProviderStatementIterator)findAncestorWithClass(this, TactileProviderStatementIterator.class);
			pageContext.getOut().print(theTactile.getProviderStatement());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for providerStatement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for providerStatement tag ");
		}
		return SKIP_BODY;
	}
}


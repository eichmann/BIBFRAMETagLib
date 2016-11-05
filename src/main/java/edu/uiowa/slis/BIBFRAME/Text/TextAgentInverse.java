package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextAgentInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextAgentInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(TextAgentInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextAgentInverseIterator theTextAgentInverseIterator = (TextAgentInverseIterator)findAncestorWithClass(this, TextAgentInverseIterator.class);
			pageContext.getOut().print(theTextAgentInverseIterator.getAgentInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for agent tag ");
		}
		return SKIP_BODY;
	}
}


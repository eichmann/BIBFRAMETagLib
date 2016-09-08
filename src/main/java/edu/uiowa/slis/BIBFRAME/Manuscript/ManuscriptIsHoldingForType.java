package edu.uiowa.slis.BIBFRAME.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptIsHoldingForType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ManuscriptIsHoldingForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptIsHoldingForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptIsHoldingForIterator theManuscriptIsHoldingForIterator = (ManuscriptIsHoldingForIterator)findAncestorWithClass(this, ManuscriptIsHoldingForIterator.class);
			pageContext.getOut().print(theManuscriptIsHoldingForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for isHoldingFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for isHoldingFor tag ");
		}
		return SKIP_BODY;
	}
}


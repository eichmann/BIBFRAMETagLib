package edu.uiowa.slis.BIBFRAME.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptGovernedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ManuscriptGovernedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptGovernedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptGovernedByIterator theManuscriptGovernedByIterator = (ManuscriptGovernedByIterator)findAncestorWithClass(this, ManuscriptGovernedByIterator.class);
			pageContext.getOut().print(theManuscriptGovernedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for governedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for governedBy tag ");
		}
		return SKIP_BODY;
	}
}


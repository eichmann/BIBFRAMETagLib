package edu.uiowa.slis.BIBFRAME.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptHeldBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ManuscriptHeldBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptHeldBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptHeldByIterator theManuscriptHeldByIterator = (ManuscriptHeldByIterator)findAncestorWithClass(this, ManuscriptHeldByIterator.class);
			pageContext.getOut().print(theManuscriptHeldByIterator.getHeldBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for heldBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for heldBy tag ");
		}
		return SKIP_BODY;
	}
}


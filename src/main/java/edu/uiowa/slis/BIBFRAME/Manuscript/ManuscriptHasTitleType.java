package edu.uiowa.slis.BIBFRAME.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptHasTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ManuscriptHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptHasTitleIterator theManuscriptHasTitleIterator = (ManuscriptHasTitleIterator)findAncestorWithClass(this, ManuscriptHasTitleIterator.class);
			pageContext.getOut().print(theManuscriptHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}


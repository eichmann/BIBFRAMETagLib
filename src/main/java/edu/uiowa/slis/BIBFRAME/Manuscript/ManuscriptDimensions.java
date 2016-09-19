package edu.uiowa.slis.BIBFRAME.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptDimensions extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ManuscriptDimensions currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptDimensions.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptDimensionsIterator theManuscript = (ManuscriptDimensionsIterator)findAncestorWithClass(this, ManuscriptDimensionsIterator.class);
			pageContext.getOut().print(theManuscript.getDimensions());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for dimensions tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for dimensions tag ");
		}
		return SKIP_BODY;
	}
}


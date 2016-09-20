package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasTitleIterator theDissertationHasTitleIterator = (DissertationHasTitleIterator)findAncestorWithClass(this, DissertationHasTitleIterator.class);
			pageContext.getOut().print(theDissertationHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}


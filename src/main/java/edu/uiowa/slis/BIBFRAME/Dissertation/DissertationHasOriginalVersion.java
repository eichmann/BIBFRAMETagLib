package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasOriginalVersion extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasOriginalVersion currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasOriginalVersion.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasOriginalVersionIterator theDissertationHasOriginalVersionIterator = (DissertationHasOriginalVersionIterator)findAncestorWithClass(this, DissertationHasOriginalVersionIterator.class);
			pageContext.getOut().print(theDissertationHasOriginalVersionIterator.getHasOriginalVersion());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}


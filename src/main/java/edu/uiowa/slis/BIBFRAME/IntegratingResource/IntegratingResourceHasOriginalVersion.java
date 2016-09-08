package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasOriginalVersion extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasOriginalVersion currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasOriginalVersion.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasOriginalVersionIterator theIntegratingResourceHasOriginalVersionIterator = (IntegratingResourceHasOriginalVersionIterator)findAncestorWithClass(this, IntegratingResourceHasOriginalVersionIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasOriginalVersionIterator.getHasOriginalVersion());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}


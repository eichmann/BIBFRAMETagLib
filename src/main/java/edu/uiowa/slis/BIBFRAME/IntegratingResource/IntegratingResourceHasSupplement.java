package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasSupplement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasSupplement currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasSupplement.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasSupplementIterator theIntegratingResourceHasSupplementIterator = (IntegratingResourceHasSupplementIterator)findAncestorWithClass(this, IntegratingResourceHasSupplementIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasSupplementIterator.getHasSupplement());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}


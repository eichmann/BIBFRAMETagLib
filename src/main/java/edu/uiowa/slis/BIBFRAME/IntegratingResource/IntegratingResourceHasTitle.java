package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasTitleIterator theIntegratingResourceHasTitleIterator = (IntegratingResourceHasTitleIterator)findAncestorWithClass(this, IntegratingResourceHasTitleIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}


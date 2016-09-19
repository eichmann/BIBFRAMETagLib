package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasTitleIterator theIntegratingResourceHasTitleIterator = (IntegratingResourceHasTitleIterator)findAncestorWithClass(this, IntegratingResourceHasTitleIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}


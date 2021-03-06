package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceDimensions extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceDimensions currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceDimensions.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceDimensionsIterator theInstance = (InstanceDimensionsIterator)findAncestorWithClass(this, InstanceDimensionsIterator.class);
			pageContext.getOut().print(theInstance.getDimensions());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for dimensions tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for dimensions tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasFindingAidType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasFindingAidType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasFindingAidType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasFindingAidIterator theIntegratingResourceHasFindingAidIterator = (IntegratingResourceHasFindingAidIterator)findAncestorWithClass(this, IntegratingResourceHasFindingAidIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasFindingAidIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}


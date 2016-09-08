package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceTranslatedAsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceTranslatedAsType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceTranslatedAsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceTranslatedAsIterator theIntegratingResourceTranslatedAsIterator = (IntegratingResourceTranslatedAsIterator)findAncestorWithClass(this, IntegratingResourceTranslatedAsIterator.class);
			pageContext.getOut().print(theIntegratingResourceTranslatedAsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}


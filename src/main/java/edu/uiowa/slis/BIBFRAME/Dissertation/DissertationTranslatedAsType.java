package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationTranslatedAsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationTranslatedAsType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationTranslatedAsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationTranslatedAsIterator theDissertationTranslatedAsIterator = (DissertationTranslatedAsIterator)findAncestorWithClass(this, DissertationTranslatedAsIterator.class);
			pageContext.getOut().print(theDissertationTranslatedAsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationCreatedForDegreeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationCreatedForDegreeType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationCreatedForDegreeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationCreatedForDegreeIterator theDissertationCreatedForDegreeIterator = (DissertationCreatedForDegreeIterator)findAncestorWithClass(this, DissertationCreatedForDegreeIterator.class);
			pageContext.getOut().print(theDissertationCreatedForDegreeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}


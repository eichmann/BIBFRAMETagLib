package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationCreatedForDegree extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationCreatedForDegree currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationCreatedForDegree.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationCreatedForDegreeIterator theDissertationCreatedForDegreeIterator = (DissertationCreatedForDegreeIterator)findAncestorWithClass(this, DissertationCreatedForDegreeIterator.class);
			pageContext.getOut().print(theDissertationCreatedForDegreeIterator.getCreatedForDegree());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}


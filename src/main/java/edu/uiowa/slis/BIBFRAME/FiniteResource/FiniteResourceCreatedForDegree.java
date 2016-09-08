package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceCreatedForDegree extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceCreatedForDegree currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceCreatedForDegree.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceCreatedForDegreeIterator theFiniteResourceCreatedForDegreeIterator = (FiniteResourceCreatedForDegreeIterator)findAncestorWithClass(this, FiniteResourceCreatedForDegreeIterator.class);
			pageContext.getOut().print(theFiniteResourceCreatedForDegreeIterator.getCreatedForDegree());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}


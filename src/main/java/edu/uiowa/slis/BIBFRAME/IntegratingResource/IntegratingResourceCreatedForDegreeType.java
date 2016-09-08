package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceCreatedForDegreeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceCreatedForDegreeType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceCreatedForDegreeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceCreatedForDegreeIterator theIntegratingResourceCreatedForDegreeIterator = (IntegratingResourceCreatedForDegreeIterator)findAncestorWithClass(this, IntegratingResourceCreatedForDegreeIterator.class);
			pageContext.getOut().print(theIntegratingResourceCreatedForDegreeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}


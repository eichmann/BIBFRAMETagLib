package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceRelationInverseIterator theIntegratingResourceRelationInverseIterator = (IntegratingResourceRelationInverseIterator)findAncestorWithClass(this, IntegratingResourceRelationInverseIterator.class);
			pageContext.getOut().print(theIntegratingResourceRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for relation tag ");
		}
		return SKIP_BODY;
	}
}


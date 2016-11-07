package edu.uiowa.slis.BIBFRAME.ContainerTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContainerTitleDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContainerTitleDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(ContainerTitleDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContainerTitleDerivedFromIterator theContainerTitleDerivedFromIterator = (ContainerTitleDerivedFromIterator)findAncestorWithClass(this, ContainerTitleDerivedFromIterator.class);
			pageContext.getOut().print(theContainerTitleDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing ContainerTitle for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContainerTitle for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

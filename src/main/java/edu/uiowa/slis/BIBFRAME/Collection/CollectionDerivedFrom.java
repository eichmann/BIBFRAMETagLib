package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionDerivedFromIterator theCollectionDerivedFromIterator = (CollectionDerivedFromIterator)findAncestorWithClass(this, CollectionDerivedFromIterator.class);
			pageContext.getOut().print(theCollectionDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

